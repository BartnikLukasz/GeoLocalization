package bartnik.localization.GeoLocalization.controllers;

import bartnik.localization.GeoLocalization.config.ExceptionHandler;
import bartnik.localization.GeoLocalization.config.MessageProvider;
import bartnik.localization.GeoLocalization.dto.LocalizationRequestDto;
import bartnik.localization.GeoLocalization.services.LocalizationService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class LocalizationControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private LocalizationService localizationService;

    @Test
    void saveLocalization_should_return_200() throws Exception {
        this.mockMvc.perform(post("/api")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(new LocalizationRequestDto("device123", BigDecimal.valueOf(50.975), BigDecimal.valueOf(49.2123)))))
                .andExpect(status().isOk())
                .andExpect(content().string("Information has been stored"));

    }

    @Test
    void saveLocalization_should_return_400() throws Exception {
        this.mockMvc.perform(post("/api")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(new LocalizationRequestDto("device1", BigDecimal.valueOf(50.975), BigDecimal.valueOf(49.2123)))))
                .andExpect(status().isBadRequest())
                .andExpect(content().string("Request body is invalid"));

    }

    static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}