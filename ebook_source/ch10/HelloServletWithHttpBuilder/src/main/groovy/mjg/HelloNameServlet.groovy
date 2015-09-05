/* ===================================================
 * Copyright 2012 Kousen IT, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ========================================================== */
package mjg

import groovy.servlet.ServletCategory;

import javax.servlet.ServletException
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse


class HelloNameServlet extends HttpServlet {
    void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        def session = request.session
        use (ServletCategory) {
            request.name = 'Hello, ' + (request.getParameter('name') ?: 'World')
            session['count'] = (session.count ?: 0) + 1
        }
        request.getRequestDispatcher('hello.jsp').forward(request,response)
    }
}
