/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

/**
 * This extension provides additional orthogonally aligned “{@code discard rectangles}” specified in framebuffer-space coordinates that restrict rasterization of all points, lines and triangles.
 * 
 * <p>From zero to an implementation-dependent limit (specified by {@code maxDiscardRectangles}) number of discard rectangles can be operational at once. When one or more discard rectangles are active, rasterized fragments can either survive if the fragment is within any of the operational discard rectangles ({@link #VK_DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT} mode) or be rejected if the fragment is within any of the operational discard rectangles ({@link #VK_DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT} mode).</p>
 * 
 * <p>These discard rectangles operate orthogonally to the existing scissor test functionality. The discard rectangles can be different for each physical device in a device group by specifying the device mask and setting discard rectangle dynamic state.</p>
 * 
 * <p>Version 2 of this extension introduces new dynamic states {@link #VK_DYNAMIC_STATE_DISCARD_RECTANGLE_ENABLE_EXT DYNAMIC_STATE_DISCARD_RECTANGLE_ENABLE_EXT} and {@link #VK_DYNAMIC_STATE_DISCARD_RECTANGLE_MODE_EXT DYNAMIC_STATE_DISCARD_RECTANGLE_MODE_EXT}, and the corresponding functions {@link #vkCmdSetDiscardRectangleEnableEXT CmdSetDiscardRectangleEnableEXT} and {@link #vkCmdSetDiscardRectangleModeEXT CmdSetDiscardRectangleModeEXT}. Applications that use these dynamic states must ensure the implementation advertises at least {@code specVersion} 2 of this extension.</p>
 * 
 * <h5>VK_EXT_discard_rectangles</h5>
 * 
 * <dl>
 * <dt><b>Name String</b></dt>
 * <dd>{@code VK_EXT_discard_rectangles}</dd>
 * <dt><b>Extension Type</b></dt>
 * <dd>Device extension</dd>
 * <dt><b>Registered Extension Number</b></dt>
 * <dd>100</dd>
 * <dt><b>Revision</b></dt>
 * <dd>2</dd>
 * <dt><b>Extension and Version Dependencies</b></dt>
 * <dd>{@link KHRGetPhysicalDeviceProperties2 VK_KHR_get_physical_device_properties2}</dd>
 * <dt><b>Contact</b></dt>
 * <dd><ul>
 * <li>Piers Daniell <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_EXT_discard_rectangles]%20@pdaniell-nv%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_EXT_discard_rectangles%20extension*">pdaniell-nv</a></li>
 * </ul></dd>
 * </dl>
 * 
 * <h5>Other Extension Metadata</h5>
 * 
 * <dl>
 * <dt><b>Last Modified Date</b></dt>
 * <dd>2023-01-18</dd>
 * <dt><b>Interactions and External Dependencies</b></dt>
 * <dd><ul>
 * <li>Interacts with {@link KHRDeviceGroup VK_KHR_device_group}</li>
 * <li>Interacts with Vulkan 1.1</li>
 * </ul></dd>
 * <dt><b>Contributors</b></dt>
 * <dd><ul>
 * <li>Daniel Koch, NVIDIA</li>
 * <li>Jeff Bolz, NVIDIA</li>
 * </ul></dd>
 * </dl>
 */
public class EXTDiscardRectangles {

    /** The extension specification version. */
    public static final int VK_EXT_DISCARD_RECTANGLES_SPEC_VERSION = 2;

    /** The extension name. */
    public static final String VK_EXT_DISCARD_RECTANGLES_EXTENSION_NAME = "VK_EXT_discard_rectangles";

    /**
     * Extends {@code VkStructureType}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DISCARD_RECTANGLE_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_DISCARD_RECTANGLE_PROPERTIES_EXT}</li>
     * <li>{@link #VK_STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT}</li>
     * </ul>
     */
    public static final int
        VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DISCARD_RECTANGLE_PROPERTIES_EXT = 1000099000,
        VK_STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT = 1000099001;

    /**
     * Extends {@code VkDynamicState}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VK_DYNAMIC_STATE_DISCARD_RECTANGLE_EXT DYNAMIC_STATE_DISCARD_RECTANGLE_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_DISCARD_RECTANGLE_ENABLE_EXT DYNAMIC_STATE_DISCARD_RECTANGLE_ENABLE_EXT}</li>
     * <li>{@link #VK_DYNAMIC_STATE_DISCARD_RECTANGLE_MODE_EXT DYNAMIC_STATE_DISCARD_RECTANGLE_MODE_EXT}</li>
     * </ul>
     */
    public static final int
        VK_DYNAMIC_STATE_DISCARD_RECTANGLE_EXT        = 1000099000,
        VK_DYNAMIC_STATE_DISCARD_RECTANGLE_ENABLE_EXT = 1000099001,
        VK_DYNAMIC_STATE_DISCARD_RECTANGLE_MODE_EXT   = 1000099002;

    /**
     * VkDiscardRectangleModeEXT - Specify the discard rectangle mode
     * 
     * <h5>Description</h5>
     * 
     * <ul>
     * <li>{@link #VK_DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT} specifies that the discard rectangle test is inclusive.</li>
     * <li>{@link #VK_DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT} specifies that the discard rectangle test is exclusive.</li>
     * </ul>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkPipelineDiscardRectangleStateCreateInfoEXT}, {@link #vkCmdSetDiscardRectangleModeEXT CmdSetDiscardRectangleModeEXT}</p>
     */
    public static final int
        VK_DISCARD_RECTANGLE_MODE_INCLUSIVE_EXT = 0,
        VK_DISCARD_RECTANGLE_MODE_EXCLUSIVE_EXT = 1;

    protected EXTDiscardRectangles() {
        throw new UnsupportedOperationException();
    }

    // --- [ vkCmdSetDiscardRectangleEXT ] ---

    /**
     * Unsafe version of: {@link #vkCmdSetDiscardRectangleEXT CmdSetDiscardRectangleEXT}
     *
     * @param discardRectangleCount the number of discard rectangles whose state are updated by the command.
     */
    public static void nvkCmdSetDiscardRectangleEXT(VkCommandBuffer commandBuffer, int firstDiscardRectangle, int discardRectangleCount, long pDiscardRectangles) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDiscardRectangleEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPPV(commandBuffer.address(), firstDiscardRectangle, discardRectangleCount, pDiscardRectangles, __functionAddress);
    }

    /**
     * Set discard rectangles dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the discard rectangles, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetDiscardRectangleEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     uint32_t                                    firstDiscardRectangle,
     *     uint32_t                                    discardRectangleCount,
     *     const VkRect2D*                             pDiscardRectangles);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>The discard rectangle taken from element <code>i</code> of {@code pDiscardRectangles} replace the current state for the discard rectangle at index <code>firstDiscardRectangle + i</code>, for <code>i</code> in <code>[0, discardRectangleCount)</code>.</p>
     * 
     * <p>This command sets the discard rectangles for subsequent drawing commands when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_DISCARD_RECTANGLE_EXT DYNAMIC_STATE_DISCARD_RECTANGLE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineDiscardRectangleStateCreateInfoEXT}{@code ::pDiscardRectangles} values used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The sum of {@code firstDiscardRectangle} and {@code discardRectangleCount} <b>must</b> be less than or equal to {@link VkPhysicalDeviceDiscardRectanglePropertiesEXT}{@code ::maxDiscardRectangles}</li>
     * <li>The {@code x} and {@code y} member of {@code offset} in each {@link VkRect2D} element of {@code pDiscardRectangles} <b>must</b> be greater than or equal to 0</li>
     * <li>Evaluation of <code>(offset.x + extent.width)</code> in each {@link VkRect2D} element of {@code pDiscardRectangles} <b>must</b> not cause a signed integer addition overflow</li>
     * <li>Evaluation of <code>(offset.y + extent.height)</code> in each {@link VkRect2D} element of {@code pDiscardRectangles} <b>must</b> not cause a signed integer addition overflow</li>
     * <li>If this command is recorded in a secondary command buffer with {@link VkCommandBufferInheritanceViewportScissorInfoNV}{@code ::viewportScissor2D} enabled, then this function <b>must</b> not be called</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code pDiscardRectangles} <b>must</b> be a valid pointer to an array of {@code discardRectangleCount} {@link VkRect2D} structures</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * <li>{@code discardRectangleCount} <b>must</b> be greater than 0</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     * 
     * <h5>See Also</h5>
     * 
     * <p>{@link VkRect2D}</p>
     *
     * @param commandBuffer         the command buffer into which the command will be recorded.
     * @param firstDiscardRectangle the index of the first discard rectangle whose state is updated by the command.
     * @param pDiscardRectangles    a pointer to an array of {@link VkRect2D} structures specifying discard rectangles.
     */
    public static void vkCmdSetDiscardRectangleEXT(VkCommandBuffer commandBuffer, @NativeType("uint32_t") int firstDiscardRectangle, @NativeType("VkRect2D const *") VkRect2D.Buffer pDiscardRectangles) {
        nvkCmdSetDiscardRectangleEXT(commandBuffer, firstDiscardRectangle, pDiscardRectangles.remaining(), pDiscardRectangles.address());
    }

    // --- [ vkCmdSetDiscardRectangleEnableEXT ] ---

    /**
     * Enable discard rectangles dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> whether discard rectangles are enabled, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetDiscardRectangleEnableEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkBool32                                    discardRectangleEnable);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the discard rectangle enable for subsequent drawing commands when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_DISCARD_RECTANGLE_ENABLE_EXT DYNAMIC_STATE_DISCARD_RECTANGLE_ENABLE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is implied by the {@link VkPipelineDiscardRectangleStateCreateInfoEXT}{@code ::discardRectangleCount} value used to create the currently active pipeline, where a non-zero {@code discardRectangleCount} implicitly enables discard rectangles, otherwise they are disabled.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The {@link EXTDiscardRectangles VK_EXT_discard_rectangles} extension <b>must</b> be enabled, and the implementation <b>must</b> support at least {@code specVersion} 2 of this extension</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer          the command buffer into which the command will be recorded.
     * @param discardRectangleEnable specifies whether discard rectangles are enabled or not.
     */
    public static void vkCmdSetDiscardRectangleEnableEXT(VkCommandBuffer commandBuffer, @NativeType("VkBool32") boolean discardRectangleEnable) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDiscardRectangleEnableEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), discardRectangleEnable ? 1 : 0, __functionAddress);
    }

    // --- [ vkCmdSetDiscardRectangleModeEXT ] ---

    /**
     * Sets the discard rectangle mode dynamically for a command buffer.
     * 
     * <h5>C Specification</h5>
     * 
     * <p>To <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#pipelines-dynamic-state">dynamically set</a> the discard rectangle mode, call:</p>
     * 
     * <pre><code>
     * void vkCmdSetDiscardRectangleModeEXT(
     *     VkCommandBuffer                             commandBuffer,
     *     VkDiscardRectangleModeEXT                   discardRectangleMode);</code></pre>
     * 
     * <h5>Description</h5>
     * 
     * <p>This command sets the discard rectangle mode for subsequent drawing commands when the graphics pipeline is created with {@link #VK_DYNAMIC_STATE_DISCARD_RECTANGLE_MODE_EXT DYNAMIC_STATE_DISCARD_RECTANGLE_MODE_EXT} set in {@link VkPipelineDynamicStateCreateInfo}{@code ::pDynamicStates}. Otherwise, this state is specified by the {@link VkPipelineDiscardRectangleStateCreateInfoEXT}{@code ::discardRectangleMode} value used to create the currently active pipeline.</p>
     * 
     * <h5>Valid Usage</h5>
     * 
     * <ul>
     * <li>The {@link EXTDiscardRectangles VK_EXT_discard_rectangles} extension <b>must</b> be enabled, and the implementation <b>must</b> support at least {@code specVersion} 2 of this extension</li>
     * </ul>
     * 
     * <h5>Valid Usage (Implicit)</h5>
     * 
     * <ul>
     * <li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
     * <li>{@code discardRectangleMode} <b>must</b> be a valid {@code VkDiscardRectangleModeEXT} value</li>
     * <li>{@code commandBuffer} <b>must</b> be in the <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#commandbuffers-lifecycle">recording state</a></li>
     * <li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics operations</li>
     * <li>This command <b>must</b> only be called outside of a video coding scope</li>
     * </ul>
     * 
     * <h5>Host Synchronization</h5>
     * 
     * <ul>
     * <li>Host access to {@code commandBuffer} <b>must</b> be externally synchronized</li>
     * <li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
     * </ul>
     * 
     * <h5>Command Properties</h5>
     * 
     * <table class="lwjgl">
     * <thead><tr><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkCommandBufferLevel">Command Buffer Levels</a></th><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginRenderPass">Render Pass Scope</a></th><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#vkCmdBeginVideoCodingKHR">Video Coding Scope</a></th><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#VkQueueFlagBits">Supported Queue Types</a></th><th><a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-queueoperation-command-types">Command Type</a></th></tr></thead>
     * <tbody><tr><td>Primary Secondary</td><td>Both</td><td>Outside</td><td>Graphics</td><td>State</td></tr></tbody>
     * </table>
     *
     * @param commandBuffer        the command buffer into which the command will be recorded.
     * @param discardRectangleMode specifies the discard rectangle mode for all discard rectangles, either inclusive or exclusive.
     */
    public static void vkCmdSetDiscardRectangleModeEXT(VkCommandBuffer commandBuffer, @NativeType("VkDiscardRectangleModeEXT") int discardRectangleMode) {
        long __functionAddress = commandBuffer.getCapabilities().vkCmdSetDiscardRectangleModeEXT;
        if (CHECKS) {
            check(__functionAddress);
        }
        callPV(commandBuffer.address(), discardRectangleMode, __functionAddress);
    }

}