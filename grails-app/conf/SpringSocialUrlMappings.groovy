/* Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
class SpringSocialUrlMappings {

  static mappings = {
    //TODO: Document this UrlMappings
    name springSocialConnect: "/ssconnect/$providerId/$providerUserId?" {
      controller = 'springSocialConnect'
      action = [GET: "oauthCallback", POST: 'connect', DELETE: "disconnect"]
    }
    name springSocialSignIn: "/sssignin/$providerId/$providerUserId?" {
      controller = 'springSocialProviderSignIn'
      action = [GET: "oauthCallback", POST: 'signin']
    }
  }
}
