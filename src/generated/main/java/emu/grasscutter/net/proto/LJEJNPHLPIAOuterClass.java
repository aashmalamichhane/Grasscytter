// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LJEJNPHLPIA.proto

package emu.grasscutter.net.proto;

public final class LJEJNPHLPIAOuterClass {
  private LJEJNPHLPIAOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LJEJNPHLPIAOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LJEJNPHLPIA)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 score = 12;</code>
     * @return The score.
     */
    int getScore();

    /**
     * <code>uint32 gallery_id = 13;</code>
     * @return The galleryId.
     */
    int getGalleryId();

    /**
     * <code>bool is_success = 10;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();

    /**
     * <code>uint32 LLJGBGFKOLG = 2;</code>
     * @return The lLJGBGFKOLG.
     */
    int getLLJGBGFKOLG();

    /**
     * <code>uint32 GACEJNFIABE = 15;</code>
     * @return The gACEJNFIABE.
     */
    int getGACEJNFIABE();

    /**
     * <code>uint32 LFDDCCODMFF = 14;</code>
     * @return The lFDDCCODMFF.
     */
    int getLFDDCCODMFF();

    /**
     * <code>bool JLODFIIBEEI = 8;</code>
     * @return The jLODFIIBEEI.
     */
    boolean getJLODFIIBEEI();
  }
  /**
   * <pre>
   * CmdId: 26093
   * </pre>
   *
   * Protobuf type {@code LJEJNPHLPIA}
   */
  public static final class LJEJNPHLPIA extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LJEJNPHLPIA)
      LJEJNPHLPIAOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LJEJNPHLPIA.newBuilder() to construct.
    private LJEJNPHLPIA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LJEJNPHLPIA() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LJEJNPHLPIA();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LJEJNPHLPIA(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 16: {

              lLJGBGFKOLG_ = input.readUInt32();
              break;
            }
            case 64: {

              jLODFIIBEEI_ = input.readBool();
              break;
            }
            case 80: {

              isSuccess_ = input.readBool();
              break;
            }
            case 96: {

              score_ = input.readUInt32();
              break;
            }
            case 104: {

              galleryId_ = input.readUInt32();
              break;
            }
            case 112: {

              lFDDCCODMFF_ = input.readUInt32();
              break;
            }
            case 120: {

              gACEJNFIABE_ = input.readUInt32();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.internal_static_LJEJNPHLPIA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.internal_static_LJEJNPHLPIA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA.class, emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA.Builder.class);
    }

    public static final int SCORE_FIELD_NUMBER = 12;
    private int score_;
    /**
     * <code>uint32 score = 12;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 13;
    private int galleryId_;
    /**
     * <code>uint32 gallery_id = 13;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 10;
    private boolean isSuccess_;
    /**
     * <code>bool is_success = 10;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
    }

    public static final int LLJGBGFKOLG_FIELD_NUMBER = 2;
    private int lLJGBGFKOLG_;
    /**
     * <code>uint32 LLJGBGFKOLG = 2;</code>
     * @return The lLJGBGFKOLG.
     */
    @java.lang.Override
    public int getLLJGBGFKOLG() {
      return lLJGBGFKOLG_;
    }

    public static final int GACEJNFIABE_FIELD_NUMBER = 15;
    private int gACEJNFIABE_;
    /**
     * <code>uint32 GACEJNFIABE = 15;</code>
     * @return The gACEJNFIABE.
     */
    @java.lang.Override
    public int getGACEJNFIABE() {
      return gACEJNFIABE_;
    }

    public static final int LFDDCCODMFF_FIELD_NUMBER = 14;
    private int lFDDCCODMFF_;
    /**
     * <code>uint32 LFDDCCODMFF = 14;</code>
     * @return The lFDDCCODMFF.
     */
    @java.lang.Override
    public int getLFDDCCODMFF() {
      return lFDDCCODMFF_;
    }

    public static final int JLODFIIBEEI_FIELD_NUMBER = 8;
    private boolean jLODFIIBEEI_;
    /**
     * <code>bool JLODFIIBEEI = 8;</code>
     * @return The jLODFIIBEEI.
     */
    @java.lang.Override
    public boolean getJLODFIIBEEI() {
      return jLODFIIBEEI_;
    }

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
      if (lLJGBGFKOLG_ != 0) {
        output.writeUInt32(2, lLJGBGFKOLG_);
      }
      if (jLODFIIBEEI_ != false) {
        output.writeBool(8, jLODFIIBEEI_);
      }
      if (isSuccess_ != false) {
        output.writeBool(10, isSuccess_);
      }
      if (score_ != 0) {
        output.writeUInt32(12, score_);
      }
      if (galleryId_ != 0) {
        output.writeUInt32(13, galleryId_);
      }
      if (lFDDCCODMFF_ != 0) {
        output.writeUInt32(14, lFDDCCODMFF_);
      }
      if (gACEJNFIABE_ != 0) {
        output.writeUInt32(15, gACEJNFIABE_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (lLJGBGFKOLG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, lLJGBGFKOLG_);
      }
      if (jLODFIIBEEI_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(8, jLODFIIBEEI_);
      }
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isSuccess_);
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, score_);
      }
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, galleryId_);
      }
      if (lFDDCCODMFF_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, lFDDCCODMFF_);
      }
      if (gACEJNFIABE_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, gACEJNFIABE_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA other = (emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA) obj;

      if (getScore()
          != other.getScore()) return false;
      if (getGalleryId()
          != other.getGalleryId()) return false;
      if (getIsSuccess()
          != other.getIsSuccess()) return false;
      if (getLLJGBGFKOLG()
          != other.getLLJGBGFKOLG()) return false;
      if (getGACEJNFIABE()
          != other.getGACEJNFIABE()) return false;
      if (getLFDDCCODMFF()
          != other.getLFDDCCODMFF()) return false;
      if (getJLODFIIBEEI()
          != other.getJLODFIIBEEI()) return false;
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
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (37 * hash) + LLJGBGFKOLG_FIELD_NUMBER;
      hash = (53 * hash) + getLLJGBGFKOLG();
      hash = (37 * hash) + GACEJNFIABE_FIELD_NUMBER;
      hash = (53 * hash) + getGACEJNFIABE();
      hash = (37 * hash) + LFDDCCODMFF_FIELD_NUMBER;
      hash = (53 * hash) + getLFDDCCODMFF();
      hash = (37 * hash) + JLODFIIBEEI_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getJLODFIIBEEI());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA prototype) {
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
     * CmdId: 26093
     * </pre>
     *
     * Protobuf type {@code LJEJNPHLPIA}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LJEJNPHLPIA)
        emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIAOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.internal_static_LJEJNPHLPIA_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.internal_static_LJEJNPHLPIA_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA.class, emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA.newBuilder()
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
        score_ = 0;

        galleryId_ = 0;

        isSuccess_ = false;

        lLJGBGFKOLG_ = 0;

        gACEJNFIABE_ = 0;

        lFDDCCODMFF_ = 0;

        jLODFIIBEEI_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.internal_static_LJEJNPHLPIA_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA build() {
        emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA buildPartial() {
        emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA result = new emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA(this);
        result.score_ = score_;
        result.galleryId_ = galleryId_;
        result.isSuccess_ = isSuccess_;
        result.lLJGBGFKOLG_ = lLJGBGFKOLG_;
        result.gACEJNFIABE_ = gACEJNFIABE_;
        result.lFDDCCODMFF_ = lFDDCCODMFF_;
        result.jLODFIIBEEI_ = jLODFIIBEEI_;
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
        if (other instanceof emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA) {
          return mergeFrom((emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA other) {
        if (other == emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA.getDefaultInstance()) return this;
        if (other.getScore() != 0) {
          setScore(other.getScore());
        }
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
        }
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
        }
        if (other.getLLJGBGFKOLG() != 0) {
          setLLJGBGFKOLG(other.getLLJGBGFKOLG());
        }
        if (other.getGACEJNFIABE() != 0) {
          setGACEJNFIABE(other.getGACEJNFIABE());
        }
        if (other.getLFDDCCODMFF() != 0) {
          setLFDDCCODMFF(other.getLFDDCCODMFF());
        }
        if (other.getJLODFIIBEEI() != false) {
          setJLODFIIBEEI(other.getJLODFIIBEEI());
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
        emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 12;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 12;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
        onChanged();
        return this;
      }

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 13;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 13;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
        onChanged();
        return this;
      }

      private boolean isSuccess_ ;
      /**
       * <code>bool is_success = 10;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 10;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builder setIsSuccess(boolean value) {
        
        isSuccess_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_success = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        
        isSuccess_ = false;
        onChanged();
        return this;
      }

      private int lLJGBGFKOLG_ ;
      /**
       * <code>uint32 LLJGBGFKOLG = 2;</code>
       * @return The lLJGBGFKOLG.
       */
      @java.lang.Override
      public int getLLJGBGFKOLG() {
        return lLJGBGFKOLG_;
      }
      /**
       * <code>uint32 LLJGBGFKOLG = 2;</code>
       * @param value The lLJGBGFKOLG to set.
       * @return This builder for chaining.
       */
      public Builder setLLJGBGFKOLG(int value) {
        
        lLJGBGFKOLG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 LLJGBGFKOLG = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearLLJGBGFKOLG() {
        
        lLJGBGFKOLG_ = 0;
        onChanged();
        return this;
      }

      private int gACEJNFIABE_ ;
      /**
       * <code>uint32 GACEJNFIABE = 15;</code>
       * @return The gACEJNFIABE.
       */
      @java.lang.Override
      public int getGACEJNFIABE() {
        return gACEJNFIABE_;
      }
      /**
       * <code>uint32 GACEJNFIABE = 15;</code>
       * @param value The gACEJNFIABE to set.
       * @return This builder for chaining.
       */
      public Builder setGACEJNFIABE(int value) {
        
        gACEJNFIABE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 GACEJNFIABE = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearGACEJNFIABE() {
        
        gACEJNFIABE_ = 0;
        onChanged();
        return this;
      }

      private int lFDDCCODMFF_ ;
      /**
       * <code>uint32 LFDDCCODMFF = 14;</code>
       * @return The lFDDCCODMFF.
       */
      @java.lang.Override
      public int getLFDDCCODMFF() {
        return lFDDCCODMFF_;
      }
      /**
       * <code>uint32 LFDDCCODMFF = 14;</code>
       * @param value The lFDDCCODMFF to set.
       * @return This builder for chaining.
       */
      public Builder setLFDDCCODMFF(int value) {
        
        lFDDCCODMFF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 LFDDCCODMFF = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearLFDDCCODMFF() {
        
        lFDDCCODMFF_ = 0;
        onChanged();
        return this;
      }

      private boolean jLODFIIBEEI_ ;
      /**
       * <code>bool JLODFIIBEEI = 8;</code>
       * @return The jLODFIIBEEI.
       */
      @java.lang.Override
      public boolean getJLODFIIBEEI() {
        return jLODFIIBEEI_;
      }
      /**
       * <code>bool JLODFIIBEEI = 8;</code>
       * @param value The jLODFIIBEEI to set.
       * @return This builder for chaining.
       */
      public Builder setJLODFIIBEEI(boolean value) {
        
        jLODFIIBEEI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool JLODFIIBEEI = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearJLODFIIBEEI() {
        
        jLODFIIBEEI_ = false;
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


      // @@protoc_insertion_point(builder_scope:LJEJNPHLPIA)
    }

    // @@protoc_insertion_point(class_scope:LJEJNPHLPIA)
    private static final emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA();
    }

    public static emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LJEJNPHLPIA>
        PARSER = new com.google.protobuf.AbstractParser<LJEJNPHLPIA>() {
      @java.lang.Override
      public LJEJNPHLPIA parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LJEJNPHLPIA(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LJEJNPHLPIA> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LJEJNPHLPIA> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LJEJNPHLPIAOuterClass.LJEJNPHLPIA getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LJEJNPHLPIA_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LJEJNPHLPIA_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021LJEJNPHLPIA.proto\"\230\001\n\013LJEJNPHLPIA\022\r\n\005s" +
      "core\030\014 \001(\r\022\022\n\ngallery_id\030\r \001(\r\022\022\n\nis_suc" +
      "cess\030\n \001(\010\022\023\n\013LLJGBGFKOLG\030\002 \001(\r\022\023\n\013GACEJ" +
      "NFIABE\030\017 \001(\r\022\023\n\013LFDDCCODMFF\030\016 \001(\r\022\023\n\013JLO" +
      "DFIIBEEI\030\010 \001(\010B\033\n\031emu.grasscutter.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LJEJNPHLPIA_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LJEJNPHLPIA_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LJEJNPHLPIA_descriptor,
        new java.lang.String[] { "Score", "GalleryId", "IsSuccess", "LLJGBGFKOLG", "GACEJNFIABE", "LFDDCCODMFF", "JLODFIIBEEI", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
