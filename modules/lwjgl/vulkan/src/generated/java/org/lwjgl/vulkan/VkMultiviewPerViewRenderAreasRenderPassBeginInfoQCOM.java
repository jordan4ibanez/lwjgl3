/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Set the multiview per view render areas for a render pass instance.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code perViewRenderAreaCount} is not zero, then the elements of {@code pPerViewRenderAreas} override the value of {@link VkRenderPassBeginInfo}{@code ::renderArea} or {@link VkRenderingInfo}{@code ::renderArea} and define per-view render areas for the individual views of a multiview render pass. The render area for the view with <em>view index</em> {@code i} is specified by {@code pPerViewRenderAreas}[i].</p>
 * 
 * <p>The per-view render areas define per-view regions of attachments that are loaded, stored, and resolved according to the {@code loadOp}, {@code storeOp}, and {@code resolveMode} values of the render pass instance. When per-view render areas are defined, the value of {@link VkRenderPassBeginInfo}{@code ::renderArea} or {@link VkRenderingInfo}{@code ::renderArea} <b>must</b> be set to a render area that includes the union of all per-view render areas, <b>may</b> be used by the implementation for optimizations, but does not affect loads, stores, or resolves.</p>
 * 
 * <p>If this structure is present and if {@code perViewRenderAreaCount} is not zero, then {@code perViewRenderAreaCount} <b>must</b> be at least least one greater than the most significant bit set in any any element of {@link VkRenderPassMultiviewCreateInfo}{@code ::pViewMasks}. or {@link VkRenderingInfo}{@code ::viewMask}</p>
 * 
 * <p>If this structure is not present or if {@code perViewRenderAreaCount} is zero, {@link VkRenderPassBeginInfo}{@code ::renderArea} or {@link VkRenderingInfo}{@code ::renderArea} is used for all views.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The {@code offset.x} member of any element of {@code pPerViewRenderAreas} <b>must</b> be greater than or equal to 0</li>
 * <li>The {@code offset.y} member of any element of {@code pPerViewRenderAreas} <b>must</b> be greater than or equal to 0</li>
 * <li>The sum of the {@code offset.x} and {@code extent.width} members of any element of {@code pPerViewRenderAreas} <b>must</b> be less than or equal to <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxFramebufferWidth">{@code maxFramebufferWidth}</a></li>
 * <li>The sum of the {@code offset.y} and {@code extent.height} members of any element of {@code pPerViewRenderAreas} <b>must</b> be less than or equal to <a target="_blank" href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxFramebufferHeight">{@code maxFramebufferHeight}</a></li>
 * <li>If this structure is in the {@code pNext} chain of {@link VkRenderPassBeginInfo} and if the render pass object included an element in {@link VkRenderPassMultiviewCreateInfo}{@code ::pViewMasks} that set bit {@code n}, then {@code perViewRenderAreaCount} <b>must</b> be at least equal to {@code n+1}.</li>
 * <li>If this structure is in the {@code pNext} chain of {@link VkRenderingInfo} and if {@link VkRenderingInfo}{@code ::viewMask} set bit {@code n}, then {@code perViewRenderAreaCount} <b>must</b> be at least equal to {@code n+1}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link QCOMMultiviewPerViewRenderAreas#VK_STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_RENDER_AREAS_RENDER_PASS_BEGIN_INFO_QCOM STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_RENDER_AREAS_RENDER_PASS_BEGIN_INFO_QCOM}</li>
 * <li>If {@code perViewRenderAreaCount} is not 0, {@code pPerViewRenderAreas} <b>must</b> be a valid pointer to an array of {@code perViewRenderAreaCount} {@link VkRect2D} structures</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkRect2D}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #perViewRenderAreaCount};
 *     {@link VkRect2D VkRect2D} const * {@link #pPerViewRenderAreas};
 * }</code></pre>
 */
public class VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PERVIEWRENDERAREACOUNT,
        PPERVIEWRENDERAREAS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PERVIEWRENDERAREACOUNT = layout.offsetof(2);
        PPERVIEWRENDERAREAS = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the number of elements in the {@code pPerViewRenderAreas} array. */
    @NativeType("uint32_t")
    public int perViewRenderAreaCount() { return nperViewRenderAreaCount(address()); }
    /** a pointer to an array of {@link VkRect2D} structures defining the render area for each view. */
    @Nullable
    @NativeType("VkRect2D const *")
    public VkRect2D.Buffer pPerViewRenderAreas() { return npPerViewRenderAreas(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMMultiviewPerViewRenderAreas#VK_STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_RENDER_AREAS_RENDER_PASS_BEGIN_INFO_QCOM STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_RENDER_AREAS_RENDER_PASS_BEGIN_INFO_QCOM} value to the {@link #sType} field. */
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM sType$Default() { return sType(QCOMMultiviewPerViewRenderAreas.VK_STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_RENDER_AREAS_RENDER_PASS_BEGIN_INFO_QCOM); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@link #pPerViewRenderAreas} field. */
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM pPerViewRenderAreas(@Nullable @NativeType("VkRect2D const *") VkRect2D.Buffer value) { npPerViewRenderAreas(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM set(
        int sType,
        long pNext,
        @Nullable VkRect2D.Buffer pPerViewRenderAreas
    ) {
        sType(sType);
        pNext(pNext);
        pPerViewRenderAreas(pPerViewRenderAreas);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM set(VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM malloc() {
        return wrap(VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM calloc() {
        return wrap(VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM} instance allocated with {@link BufferUtils}. */
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.class, memAddress(container), container);
    }

    /** Returns a new {@code VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM} instance for the specified memory address. */
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM create(long address) {
        return wrap(VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM createSafe(long address) {
        return address == NULL ? null : wrap(VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.class, address);
    }

    /**
     * Returns a new {@link VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM malloc(MemoryStack stack) {
        return wrap(VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM calloc(MemoryStack stack) {
        return wrap(VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.PNEXT); }
    /** Unsafe version of {@link #perViewRenderAreaCount}. */
    public static int nperViewRenderAreaCount(long struct) { return UNSAFE.getInt(null, struct + VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.PERVIEWRENDERAREACOUNT); }
    /** Unsafe version of {@link #pPerViewRenderAreas}. */
    @Nullable public static VkRect2D.Buffer npPerViewRenderAreas(long struct) { return VkRect2D.createSafe(memGetAddress(struct + VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.PPERVIEWRENDERAREAS), nperViewRenderAreaCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.PNEXT, value); }
    /** Sets the specified value to the {@code perViewRenderAreaCount} field of the specified {@code struct}. */
    public static void nperViewRenderAreaCount(long struct, int value) { UNSAFE.putInt(null, struct + VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.PERVIEWRENDERAREACOUNT, value); }
    /** Unsafe version of {@link #pPerViewRenderAreas(VkRect2D.Buffer) pPerViewRenderAreas}. */
    public static void npPerViewRenderAreas(long struct, @Nullable VkRect2D.Buffer value) { memPutAddress(struct + VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.PPERVIEWRENDERAREAS, memAddressSafe(value)); nperViewRenderAreaCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nperViewRenderAreaCount(struct) != 0) {
            check(memGetAddress(struct + VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.PPERVIEWRENDERAREAS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM} structs. */
    public static class Buffer extends StructBuffer<VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM, Buffer> implements NativeResource {

        private static final VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM ELEMENT_FACTORY = VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.create(-1L);

        /**
         * Creates a new {@code VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.nsType(address()); }
        /** @return the value of the {@link VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.npNext(address()); }
        /** @return the value of the {@link VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM#perViewRenderAreaCount} field. */
        @NativeType("uint32_t")
        public int perViewRenderAreaCount() { return VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.nperViewRenderAreaCount(address()); }
        /** @return a {@link VkRect2D.Buffer} view of the struct array pointed to by the {@link VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM#pPerViewRenderAreas} field. */
        @Nullable
        @NativeType("VkRect2D const *")
        public VkRect2D.Buffer pPerViewRenderAreas() { return VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.npPerViewRenderAreas(address()); }

        /** Sets the specified value to the {@link VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM#sType} field. */
        public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMMultiviewPerViewRenderAreas#VK_STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_RENDER_AREAS_RENDER_PASS_BEGIN_INFO_QCOM STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_RENDER_AREAS_RENDER_PASS_BEGIN_INFO_QCOM} value to the {@link VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM#sType} field. */
        public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer sType$Default() { return sType(QCOMMultiviewPerViewRenderAreas.VK_STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_RENDER_AREAS_RENDER_PASS_BEGIN_INFO_QCOM); }
        /** Sets the specified value to the {@link VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM#pNext} field. */
        public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer pNext(@NativeType("void const *") long value) { VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkRect2D.Buffer} to the {@link VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM#pPerViewRenderAreas} field. */
        public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.Buffer pPerViewRenderAreas(@Nullable @NativeType("VkRect2D const *") VkRect2D.Buffer value) { VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.npPerViewRenderAreas(address(), value); return this; }

    }

}