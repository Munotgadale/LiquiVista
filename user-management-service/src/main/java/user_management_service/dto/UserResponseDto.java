package user_management_service.dto;

import java.time.LocalDate;

public record UserResponseDto(Long userId,
                              String userFirstName,
                              String userLastName,
                              String userEmail,
                              String userPhoneNumber,
                              String userGender,
                              LocalDate userDateOfBirth,
                              String legalDocumentFilePath,
                              Boolean isAgeVerified,
                              String userStatus,
                              String userPassword) { }
