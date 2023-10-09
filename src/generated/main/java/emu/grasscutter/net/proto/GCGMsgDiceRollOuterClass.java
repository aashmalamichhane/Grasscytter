// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGMsgDiceRoll.proto

package emu.grasscutter.net.proto;

public final class GCGMsgDiceRollOuterClass {
  private GCGMsgDiceRollOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGMsgDiceRollOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGMsgDiceRoll)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 controller_id = 10;</code>
     * @return The controllerId.
     */
    int getControllerId();

    /**
     * <code>uint32 dice_num = 1;</code>
     * @return The diceNum.
     */
    int getDiceNum();

    /**
     * <code>repeated .GCGDiceSideType dice_side_list = 11;</code>
     * @return A list containing the diceSideList.
     */
    java.util.List<emu.grasscutter.net.proto.GCGDiceSideTypeOuterClass.GCGDiceSideType> getDiceSideListList();
    /**
     * <code>repeated .GCGDiceSideType dice_side_list = 11;</code>
     * @return The count of diceSideList.
     */
    int getDiceSideListCount();
    /**
     * <code>repeated .GCGDiceSideType dice_side_list = 11;</code>
     * @param index The index of the element to return.
     * @return The diceSideList at the given index.
     */
    emu.grasscutter.net.proto.GCGDiceSideTypeOuterClass.GCGDiceSideType getDiceSideList(int index);
    /**
     * <code>repeated .GCGDiceSideType dice_side_list = 11;</code>
     * @return A list containing the enum numeric values on the wire for diceSideList.
     */
    java.util.List<java.lang.Integer>
    getDiceSideListValueList();
    /**
     * <code>repeated .GCGDiceSideType dice_side_list = 11;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of diceSideList at the given index.
     */
    int getDiceSideListValue(int index);
  }
  /**
   * <pre>
   * Obf: NOFCBPBCHDO
   * </pre>
   *
   * Protobuf type {@code GCGMsgDiceRoll}
   */
  public static final class GCGMsgDiceRoll extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGMsgDiceRoll)
      GCGMsgDiceRollOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGMsgDiceRoll.newBuilder() to construct.
    private GCGMsgDiceRoll(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGMsgDiceRoll() {
      diceSideList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGMsgDiceRoll();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGMsgDiceRoll(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              diceNum_ = input.readUInt32();
              break;
            }
            case 80: {

              controllerId_ = input.readUInt32();
              break;
            }
            case 88: {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                diceSideList_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              diceSideList_.add(rawValue);
              break;
            }
            case 90: {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while(input.getBytesUntilLimit() > 0) {
                int rawValue = input.readEnum();
                if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                  diceSideList_ = new java.util.ArrayList<java.lang.Integer>();
                  mutable_bitField0_ |= 0x00000001;
                }
                diceSideList_.add(rawValue);
              }
              input.popLimit(oldLimit);
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          diceSideList_ = java.util.Collections.unmodifiableList(diceSideList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.internal_static_GCGMsgDiceRoll_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.internal_static_GCGMsgDiceRoll_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll.class, emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll.Builder.class);
    }

    public static final int CONTROLLER_ID_FIELD_NUMBER = 10;
    private int controllerId_;
    /**
     * <code>uint32 controller_id = 10;</code>
     * @return The controllerId.
     */
    @java.lang.Override
    public int getControllerId() {
      return controllerId_;
    }

    public static final int DICE_NUM_FIELD_NUMBER = 1;
    private int diceNum_;
    /**
     * <code>uint32 dice_num = 1;</code>
     * @return The diceNum.
     */
    @java.lang.Override
    public int getDiceNum() {
      return diceNum_;
    }

    public static final int DICE_SIDE_LIST_FIELD_NUMBER = 11;
    private java.util.List<java.lang.Integer> diceSideList_;
    private static final com.google.protobuf.Internal.ListAdapter.Converter<
        java.lang.Integer, emu.grasscutter.net.proto.GCGDiceSideTypeOuterClass.GCGDiceSideType> diceSideList_converter_ =
            new com.google.protobuf.Internal.ListAdapter.Converter<
                java.lang.Integer, emu.grasscutter.net.proto.GCGDiceSideTypeOuterClass.GCGDiceSideType>() {
              public emu.grasscutter.net.proto.GCGDiceSideTypeOuterClass.GCGDiceSideType convert(java.lang.Integer from) {
                @SuppressWarnings("deprecation")
                emu.grasscutter.net.proto.GCGDiceSideTypeOuterClass.GCGDiceSideType result = emu.grasscutter.net.proto.GCGDiceSideTypeOuterClass.GCGDiceSideType.valueOf(from);
                return result == null ? emu.grasscutter.net.proto.GCGDiceSideTypeOuterClass.GCGDiceSideType.UNRECOGNIZED : result;
              }
            };
    /**
     * <code>repeated .GCGDiceSideType dice_side_list = 11;</code>
     * @return A list containing the diceSideList.
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.GCGDiceSideTypeOuterClass.GCGDiceSideType> getDiceSideListList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, emu.grasscutter.net.proto.GCGDiceSideTypeOuterClass.GCGDiceSideType>(diceSideList_, diceSideList_converter_);
    }
    /**
     * <code>repeated .GCGDiceSideType dice_side_list = 11;</code>
     * @return The count of diceSideList.
     */
    @java.lang.Override
    public int getDiceSideListCount() {
      return diceSideList_.size();
    }
    /**
     * <code>repeated .GCGDiceSideType dice_side_list = 11;</code>
     * @param index The index of the element to return.
     * @return The diceSideList at the given index.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.GCGDiceSideTypeOuterClass.GCGDiceSideType getDiceSideList(int index) {
      return diceSideList_converter_.convert(diceSideList_.get(index));
    }
    /**
     * <code>repeated .GCGDiceSideType dice_side_list = 11;</code>
     * @return A list containing the enum numeric values on the wire for diceSideList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
    getDiceSideListValueList() {
      return diceSideList_;
    }
    /**
     * <code>repeated .GCGDiceSideType dice_side_list = 11;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of diceSideList at the given index.
     */
    @java.lang.Override
    public int getDiceSideListValue(int index) {
      return diceSideList_.get(index);
    }
    private int diceSideListMemoizedSerializedSize;

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (diceNum_ != 0) {
        output.writeUInt32(1, diceNum_);
      }
      if (controllerId_ != 0) {
        output.writeUInt32(10, controllerId_);
      }
      if (getDiceSideListList().size() > 0) {
        output.writeUInt32NoTag(90);
        output.writeUInt32NoTag(diceSideListMemoizedSerializedSize);
      }
      for (int i = 0; i < diceSideList_.size(); i++) {
        output.writeEnumNoTag(diceSideList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (diceNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, diceNum_);
      }
      if (controllerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, controllerId_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < diceSideList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeEnumSizeNoTag(diceSideList_.get(i));
        }
        size += dataSize;
        if (!getDiceSideListList().isEmpty()) {  size += 1;
          size += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(dataSize);
        }diceSideListMemoizedSerializedSize = dataSize;
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll other = (emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll) obj;

      if (getControllerId()
          != other.getControllerId()) return false;
      if (getDiceNum()
          != other.getDiceNum()) return false;
      if (!diceSideList_.equals(other.diceSideList_)) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + CONTROLLER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getControllerId();
      hash = (37 * hash) + DICE_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getDiceNum();
      if (getDiceSideListCount() > 0) {
        hash = (37 * hash) + DICE_SIDE_LIST_FIELD_NUMBER;
        hash = (53 * hash) + diceSideList_.hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Obf: NOFCBPBCHDO
     * </pre>
     *
     * Protobuf type {@code GCGMsgDiceRoll}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGMsgDiceRoll)
        emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRollOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.internal_static_GCGMsgDiceRoll_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.internal_static_GCGMsgDiceRoll_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll.class, emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        controllerId_ = 0;

        diceNum_ = 0;

        diceSideList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.internal_static_GCGMsgDiceRoll_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll build() {
        emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll buildPartial() {
        emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll result = new emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll(this);
        int from_bitField0_ = bitField0_;
        result.controllerId_ = controllerId_;
        result.diceNum_ = diceNum_;
        if (((bitField0_ & 0x00000001) != 0)) {
          diceSideList_ = java.util.Collections.unmodifiableList(diceSideList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.diceSideList_ = diceSideList_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll) {
          return mergeFrom((emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll other) {
        if (other == emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll.getDefaultInstance()) return this;
        if (other.getControllerId() != 0) {
          setControllerId(other.getControllerId());
        }
        if (other.getDiceNum() != 0) {
          setDiceNum(other.getDiceNum());
        }
        if (!other.diceSideList_.isEmpty()) {
          if (diceSideList_.isEmpty()) {
            diceSideList_ = other.diceSideList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDiceSideListIsMutable();
            diceSideList_.addAll(other.diceSideList_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int controllerId_ ;
      /**
       * <code>uint32 controller_id = 10;</code>
       * @return The controllerId.
       */
      @java.lang.Override
      public int getControllerId() {
        return controllerId_;
      }
      /**
       * <code>uint32 controller_id = 10;</code>
       * @param value The controllerId to set.
       * @return This builder for chaining.
       */
      public Builder setControllerId(int value) {
        
        controllerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 controller_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearControllerId() {
        
        controllerId_ = 0;
        onChanged();
        return this;
      }

      private int diceNum_ ;
      /**
       * <code>uint32 dice_num = 1;</code>
       * @return The diceNum.
       */
      @java.lang.Override
      public int getDiceNum() {
        return diceNum_;
      }
      /**
       * <code>uint32 dice_num = 1;</code>
       * @param value The diceNum to set.
       * @return This builder for chaining.
       */
      public Builder setDiceNum(int value) {
        
        diceNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dice_num = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearDiceNum() {
        
        diceNum_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<java.lang.Integer> diceSideList_ =
        java.util.Collections.emptyList();
      private void ensureDiceSideListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          diceSideList_ = new java.util.ArrayList<java.lang.Integer>(diceSideList_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       * <code>repeated .GCGDiceSideType dice_side_list = 11;</code>
       * @return A list containing the diceSideList.
       */
      public java.util.List<emu.grasscutter.net.proto.GCGDiceSideTypeOuterClass.GCGDiceSideType> getDiceSideListList() {
        return new com.google.protobuf.Internal.ListAdapter<
            java.lang.Integer, emu.grasscutter.net.proto.GCGDiceSideTypeOuterClass.GCGDiceSideType>(diceSideList_, diceSideList_converter_);
      }
      /**
       * <code>repeated .GCGDiceSideType dice_side_list = 11;</code>
       * @return The count of diceSideList.
       */
      public int getDiceSideListCount() {
        return diceSideList_.size();
      }
      /**
       * <code>repeated .GCGDiceSideType dice_side_list = 11;</code>
       * @param index The index of the element to return.
       * @return The diceSideList at the given index.
       */
      public emu.grasscutter.net.proto.GCGDiceSideTypeOuterClass.GCGDiceSideType getDiceSideList(int index) {
        return diceSideList_converter_.convert(diceSideList_.get(index));
      }
      /**
       * <code>repeated .GCGDiceSideType dice_side_list = 11;</code>
       * @param index The index to set the value at.
       * @param value The diceSideList to set.
       * @return This builder for chaining.
       */
      public Builder setDiceSideList(
          int index, emu.grasscutter.net.proto.GCGDiceSideTypeOuterClass.GCGDiceSideType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDiceSideListIsMutable();
        diceSideList_.set(index, value.getNumber());
        onChanged();
        return this;
      }
      /**
       * <code>repeated .GCGDiceSideType dice_side_list = 11;</code>
       * @param value The diceSideList to add.
       * @return This builder for chaining.
       */
      public Builder addDiceSideList(emu.grasscutter.net.proto.GCGDiceSideTypeOuterClass.GCGDiceSideType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDiceSideListIsMutable();
        diceSideList_.add(value.getNumber());
        onChanged();
        return this;
      }
      /**
       * <code>repeated .GCGDiceSideType dice_side_list = 11;</code>
       * @param values The diceSideList to add.
       * @return This builder for chaining.
       */
      public Builder addAllDiceSideList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.GCGDiceSideTypeOuterClass.GCGDiceSideType> values) {
        ensureDiceSideListIsMutable();
        for (emu.grasscutter.net.proto.GCGDiceSideTypeOuterClass.GCGDiceSideType value : values) {
          diceSideList_.add(value.getNumber());
        }
        onChanged();
        return this;
      }
      /**
       * <code>repeated .GCGDiceSideType dice_side_list = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearDiceSideList() {
        diceSideList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .GCGDiceSideType dice_side_list = 11;</code>
       * @return A list containing the enum numeric values on the wire for diceSideList.
       */
      public java.util.List<java.lang.Integer>
      getDiceSideListValueList() {
        return java.util.Collections.unmodifiableList(diceSideList_);
      }
      /**
       * <code>repeated .GCGDiceSideType dice_side_list = 11;</code>
       * @param index The index of the value to return.
       * @return The enum numeric value on the wire of diceSideList at the given index.
       */
      public int getDiceSideListValue(int index) {
        return diceSideList_.get(index);
      }
      /**
       * <code>repeated .GCGDiceSideType dice_side_list = 11;</code>
       * @param index The index of the value to return.
       * @return The enum numeric value on the wire of diceSideList at the given index.
       * @return This builder for chaining.
       */
      public Builder setDiceSideListValue(
          int index, int value) {
        ensureDiceSideListIsMutable();
        diceSideList_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .GCGDiceSideType dice_side_list = 11;</code>
       * @param value The enum numeric value on the wire for diceSideList to add.
       * @return This builder for chaining.
       */
      public Builder addDiceSideListValue(int value) {
        ensureDiceSideListIsMutable();
        diceSideList_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated .GCGDiceSideType dice_side_list = 11;</code>
       * @param values The enum numeric values on the wire for diceSideList to add.
       * @return This builder for chaining.
       */
      public Builder addAllDiceSideListValue(
          java.lang.Iterable<java.lang.Integer> values) {
        ensureDiceSideListIsMutable();
        for (int value : values) {
          diceSideList_.add(value);
        }
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:GCGMsgDiceRoll)
    }

    // @@protoc_insertion_point(class_scope:GCGMsgDiceRoll)
    private static final emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll();
    }

    public static emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGMsgDiceRoll>
        PARSER = new com.google.protobuf.AbstractParser<GCGMsgDiceRoll>() {
      @java.lang.Override
      public GCGMsgDiceRoll parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGMsgDiceRoll(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGMsgDiceRoll> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGMsgDiceRoll> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGMsgDiceRollOuterClass.GCGMsgDiceRoll getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGMsgDiceRoll_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGMsgDiceRoll_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024GCGMsgDiceRoll.proto\032\025GCGDiceSideType." +
      "proto\"c\n\016GCGMsgDiceRoll\022\025\n\rcontroller_id" +
      "\030\n \001(\r\022\020\n\010dice_num\030\001 \001(\r\022(\n\016dice_side_li" +
      "st\030\013 \003(\0162\020.GCGDiceSideTypeB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.GCGDiceSideTypeOuterClass.getDescriptor(),
        });
    internal_static_GCGMsgDiceRoll_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGMsgDiceRoll_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGMsgDiceRoll_descriptor,
        new java.lang.String[] { "ControllerId", "DiceNum", "DiceSideList", });
    emu.grasscutter.net.proto.GCGDiceSideTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
