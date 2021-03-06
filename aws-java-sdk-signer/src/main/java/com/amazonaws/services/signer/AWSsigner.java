/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.signer;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.signer.model.*;
import com.amazonaws.services.signer.waiters.AWSsignerWaiters;

/**
 * Interface for accessing signer.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.signer.AbstractAWSsigner} instead.
 * </p>
 * <p>
 * <p>
 * With code signing for IoT, you can sign code that you create for any IoT device that is supported by Amazon Web
 * Services (AWS). Code signing is available through <a
 * href="http://docs.aws.amazon.com/freertos/latest/userguide/">Amazon FreeRTOS</a> and <a
 * href="http://docs.aws.amazon.com/iot/latest/developerguide/">AWS IoT Device Management</a>, and integrated with <a
 * href="http://docs.aws.amazon.com/acm/latest/userguide/">AWS Certificate Manager (ACM)</a>. In order to sign code, you
 * import a third-party code signing certificate with ACM that is used to sign updates in Amazon FreeRTOS and AWS IoT
 * Device Management. For general information about using code signing, see the <a
 * href="http://docs.aws.amazon.com/signer/latest/developerguide/Welcome.html">Code Signing for IoT Developer Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSsigner {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "signer";

    /**
     * <p>
     * Changes the state of an <code>ACTIVE</code> signing profile to <code>CANCELED</code>. A canceled profile is still
     * viewable with the <code>ListSigningProfiles</code> operation, but it cannot perform new signing jobs, and is
     * deleted two years after cancelation.
     * </p>
     * 
     * @param cancelSigningProfileRequest
     * @return Result of the CancelSigningProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         A specified resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The signing job has been throttled.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.CancelSigningProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/CancelSigningProfile" target="_top">AWS
     *      API Documentation</a>
     */
    CancelSigningProfileResult cancelSigningProfile(CancelSigningProfileRequest cancelSigningProfileRequest);

    /**
     * <p>
     * Returns information about a specific code signing job. You specify the job by using the <code>jobId</code> value
     * that is returned by the <a>StartSigningJob</a> operation.
     * </p>
     * 
     * @param describeSigningJobRequest
     * @return Result of the DescribeSigningJob operation returned by the service.
     * @throws ResourceNotFoundException
     *         A specified resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.DescribeSigningJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/DescribeSigningJob" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeSigningJobResult describeSigningJob(DescribeSigningJobRequest describeSigningJobRequest);

    /**
     * <p>
     * Returns information on a specific signing platform.
     * </p>
     * 
     * @param getSigningPlatformRequest
     * @return Result of the GetSigningPlatform operation returned by the service.
     * @throws ResourceNotFoundException
     *         A specified resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.GetSigningPlatform
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/GetSigningPlatform" target="_top">AWS API
     *      Documentation</a>
     */
    GetSigningPlatformResult getSigningPlatform(GetSigningPlatformRequest getSigningPlatformRequest);

    /**
     * <p>
     * Returns information on a specific signing profile.
     * </p>
     * 
     * @param getSigningProfileRequest
     * @return Result of the GetSigningProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         A specified resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The signing job has been throttled.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.GetSigningProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/GetSigningProfile" target="_top">AWS API
     *      Documentation</a>
     */
    GetSigningProfileResult getSigningProfile(GetSigningProfileRequest getSigningProfileRequest);

    /**
     * <p>
     * Lists all your signing jobs. You can use the <code>maxResults</code> parameter to limit the number of signing
     * jobs that are returned in the response. If additional jobs remain to be listed, code signing returns a
     * <code>nextToken</code> value. Use this value in subsequent calls to <code>ListSigningJobs</code> to fetch the
     * remaining values. You can continue calling <code>ListSigningJobs</code> with your <code>maxResults</code>
     * parameter and with new values that code signing returns in the <code>nextToken</code> parameter until all of your
     * signing jobs have been returned.
     * </p>
     * 
     * @param listSigningJobsRequest
     * @return Result of the ListSigningJobs operation returned by the service.
     * @throws ValidationException
     *         You signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The signing job has been throttled.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.ListSigningJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/ListSigningJobs" target="_top">AWS API
     *      Documentation</a>
     */
    ListSigningJobsResult listSigningJobs(ListSigningJobsRequest listSigningJobsRequest);

    /**
     * <p>
     * Lists all signing platforms available in code signing that match the request parameters. If additional jobs
     * remain to be listed, code signing returns a <code>nextToken</code> value. Use this value in subsequent calls to
     * <code>ListSigningJobs</code> to fetch the remaining values. You can continue calling <code>ListSigningJobs</code>
     * with your <code>maxResults</code> parameter and with new values that code signing returns in the
     * <code>nextToken</code> parameter until all of your signing jobs have been returned.
     * </p>
     * 
     * @param listSigningPlatformsRequest
     * @return Result of the ListSigningPlatforms operation returned by the service.
     * @throws ValidationException
     *         You signing certificate could not be validated.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The signing job has been throttled.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.ListSigningPlatforms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/ListSigningPlatforms" target="_top">AWS
     *      API Documentation</a>
     */
    ListSigningPlatformsResult listSigningPlatforms(ListSigningPlatformsRequest listSigningPlatformsRequest);

    /**
     * <p>
     * Lists all available signing profiles in your AWS account. Returns only profiles with an <code>ACTIVE</code>
     * status unless the <code>includeCanceled</code> request field is set to <code>true</code>. If additional jobs
     * remain to be listed, code signing returns a <code>nextToken</code> value. Use this value in subsequent calls to
     * <code>ListSigningJobs</code> to fetch the remaining values. You can continue calling <code>ListSigningJobs</code>
     * with your <code>maxResults</code> parameter and with new values that code signing returns in the
     * <code>nextToken</code> parameter until all of your signing jobs have been returned.
     * </p>
     * 
     * @param listSigningProfilesRequest
     * @return Result of the ListSigningProfiles operation returned by the service.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The signing job has been throttled.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.ListSigningProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/ListSigningProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    ListSigningProfilesResult listSigningProfiles(ListSigningProfilesRequest listSigningProfilesRequest);

    /**
     * <p>
     * Returns a list of the tags associated with a signing profile resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @throws BadRequestException
     *         The request contains invalid parameters for the ARN or tags. This exception also occurs when you call a
     *         tagging API on a cancelled signing profile.
     * @throws NotFoundException
     *         The signing profile was not found.
     * @sample AWSsigner.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Creates a signing profile. A signing profile is a code signing template that can be used to carry out a
     * pre-defined signing job. For more information, see <a
     * href="http://docs.aws.amazon.com/signer/latest/developerguide/gs-profile.html"
     * >http://docs.aws.amazon.com/signer/latest/developerguide/gs-profile.html</a>
     * </p>
     * 
     * @param putSigningProfileRequest
     * @return Result of the PutSigningProfile operation returned by the service.
     * @throws ResourceNotFoundException
     *         A specified resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ValidationException
     *         You signing certificate could not be validated.
     * @throws ThrottlingException
     *         The signing job has been throttled.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.PutSigningProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/PutSigningProfile" target="_top">AWS API
     *      Documentation</a>
     */
    PutSigningProfileResult putSigningProfile(PutSigningProfileRequest putSigningProfileRequest);

    /**
     * <p>
     * Initiates a signing job to be performed on the code provided. Signing jobs are viewable by the
     * <code>ListSigningJobs</code> operation for two years after they are performed. Note the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must create an Amazon S3 source bucket. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/gsg/CreatingABucket.html">Create a Bucket</a> in the <i>Amazon
     * S3 Getting Started Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your S3 source bucket must be version enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must create an S3 destination bucket. Code signing uses your S3 destination bucket to write your signed code.
     * </p>
     * </li>
     * <li>
     * <p>
     * You specify the name of the source and destination buckets when calling the <code>StartSigningJob</code>
     * operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must also specify a request token that identifies your request to code signing.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can call the <a>DescribeSigningJob</a> and the <a>ListSigningJobs</a> actions after you call
     * <code>StartSigningJob</code>.
     * </p>
     * <p>
     * For a Java example that shows how to use this action, see <a
     * href="http://docs.aws.amazon.com/acm/latest/userguide/">http://docs.aws.amazon.com/acm/latest/userguide/</a>
     * </p>
     * 
     * @param startSigningJobRequest
     * @return Result of the StartSigningJob operation returned by the service.
     * @throws ValidationException
     *         You signing certificate could not be validated.
     * @throws ResourceNotFoundException
     *         A specified resource could not be found.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The signing job has been throttled.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @sample AWSsigner.StartSigningJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/StartSigningJob" target="_top">AWS API
     *      Documentation</a>
     */
    StartSigningJobResult startSigningJob(StartSigningJobRequest startSigningJobRequest);

    /**
     * <p>
     * Adds one or more tags to a signing profile. Tags are labels that you can use to identify and organize your AWS
     * resources. Each tag consists of a key and an optional value. To specify the signing profile, use its Amazon
     * Resource Name (ARN). To specify the tag, use a key-value pair.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @throws BadRequestException
     *         The request contains invalid parameters for the ARN or tags. This exception also occurs when you call a
     *         tagging API on a cancelled signing profile.
     * @throws NotFoundException
     *         The signing profile was not found.
     * @sample AWSsigner.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from a signing profile. To remove the tags, specify a list of tag keys.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal error occurred.
     * @throws BadRequestException
     *         The request contains invalid parameters for the ARN or tags. This exception also occurs when you call a
     *         tagging API on a cancelled signing profile.
     * @throws NotFoundException
     *         The signing profile was not found.
     * @sample AWSsigner.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

    AWSsignerWaiters waiters();

}
