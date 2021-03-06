/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAppResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private ApplicationResponse applicationResponse;

    /**
     * @param applicationResponse
     */

    public void setApplicationResponse(ApplicationResponse applicationResponse) {
        this.applicationResponse = applicationResponse;
    }

    /**
     * @return
     */

    public ApplicationResponse getApplicationResponse() {
        return this.applicationResponse;
    }

    /**
     * @param applicationResponse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAppResult withApplicationResponse(ApplicationResponse applicationResponse) {
        setApplicationResponse(applicationResponse);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApplicationResponse() != null)
            sb.append("ApplicationResponse: ").append(getApplicationResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAppResult == false)
            return false;
        DeleteAppResult other = (DeleteAppResult) obj;
        if (other.getApplicationResponse() == null ^ this.getApplicationResponse() == null)
            return false;
        if (other.getApplicationResponse() != null && other.getApplicationResponse().equals(this.getApplicationResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationResponse() == null) ? 0 : getApplicationResponse().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAppResult clone() {
        try {
            return (DeleteAppResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
