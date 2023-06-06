/*
 * Licensed under the Apache License, Version 2.0 (the “License”);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an “AS IS” BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 password=abc@123!
 */

package com.crapi.model;

import com.crapi.enums.ERole;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class SeedUser {
  @NotBlank
  @Size(min = 3, max = 100)
  private String name;

  @NotBlank
  @Size(min = 6, max = 100)
  private String password1;

  @NotBlank
  @Size(max = 100)
  @Email
  private String email;

  @NotBlank
  @Size(max = 15)
  private String number;

  @NotBlank
  @Size(min = 3, max = 100)
  private ERole role;
 
 @NotBlank
  @Size(min = 3, max = 50)
  private String password_value;

  public SeedUser(String name, String email, String number, String password1, ERole role, String password_value) {
    this.name = name;
    this.email = email;
    this.number = number;
    this.password1 = password1;
    this.role = role;
    this.password_value = password_value;
  }
}
