/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ${package}.pojo.vo;

import com.lodsve.boot.pojo.BaseVO;
import lombok.Getter;
import lombok.Setter;

/**
 * demo vo.
 *
 * @author ${author}
 */
@Setter
@Getter
public class DemoVO extends BaseVO {
    private Long id;
    private String name;

    @Override
    public String toString() {
        return super.toString();
    }
}
