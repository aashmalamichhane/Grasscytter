// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TowerBriefDataNotify.proto

package emu.grasscutter.net.proto;

public final class TowerBriefDataNotifyOuterClass {
  private TowerBriefDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TowerBriefDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TowerBriefDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 IPKPGKDBNBL = 5;</code>
     * @return The iPKPGKDBNBL.
     */
    int getIPKPGKDBNBL();

    /**
     * <code>uint32 next_schedule_change_time = 15;</code>
     * @return The nextScheduleChangeTime.
     */
    int getNextScheduleChangeTime();

    /**
     * <code>uint32 tower_schedule_id = 9;</code>
     * @return The towerScheduleId.
     */
    int getTowerScheduleId();

    /**
     * <code>uint32 schedule_start_time = 14;</code>
     * @return The scheduleStartTime.
     */
    int getScheduleStartTime();

    /**
     * <code>uint32 OJCGNKBJNBG = 13;</code>
     * @return The oJCGNKBJNBG.
     */
    int getOJCGNKBJNBG();

    /**
     * <code>uint32 CLDPGFCBJEA = 2;</code>
     * @return The cLDPGFCBJEA.
     */
    int getCLDPGFCBJEA();

    /**
     * <code>bool is_finished_entrance_floor = 4;</code>
     * @return The isFinishedEntranceFloor.
     */
    boolean getIsFinishedEntranceFloor();
  }
  /**
   * <pre>
   * CmdId: 28206
   * Obf: FDNCNACOCMJ
   * </pre>
   *
   * Protobuf type {@code TowerBriefDataNotify}
   */
  public static final class TowerBriefDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TowerBriefDataNotify)
      TowerBriefDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TowerBriefDataNotify.newBuilder() to construct.
    private TowerBriefDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TowerBriefDataNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TowerBriefDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TowerBriefDataNotify(
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

              cLDPGFCBJEA_ = input.readUInt32();
              break;
            }
            case 32: {

              isFinishedEntranceFloor_ = input.readBool();
              break;
            }
            case 40: {

              iPKPGKDBNBL_ = input.readUInt32();
              break;
            }
            case 72: {

              towerScheduleId_ = input.readUInt32();
              break;
            }
            case 104: {

              oJCGNKBJNBG_ = input.readUInt32();
              break;
            }
            case 112: {

              scheduleStartTime_ = input.readUInt32();
              break;
            }
            case 120: {

              nextScheduleChangeTime_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.internal_static_TowerBriefDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.internal_static_TowerBriefDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify.class, emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify.Builder.class);
    }

    public static final int IPKPGKDBNBL_FIELD_NUMBER = 5;
    private int iPKPGKDBNBL_;
    /**
     * <code>uint32 IPKPGKDBNBL = 5;</code>
     * @return The iPKPGKDBNBL.
     */
    @java.lang.Override
    public int getIPKPGKDBNBL() {
      return iPKPGKDBNBL_;
    }

    public static final int NEXT_SCHEDULE_CHANGE_TIME_FIELD_NUMBER = 15;
    private int nextScheduleChangeTime_;
    /**
     * <code>uint32 next_schedule_change_time = 15;</code>
     * @return The nextScheduleChangeTime.
     */
    @java.lang.Override
    public int getNextScheduleChangeTime() {
      return nextScheduleChangeTime_;
    }

    public static final int TOWER_SCHEDULE_ID_FIELD_NUMBER = 9;
    private int towerScheduleId_;
    /**
     * <code>uint32 tower_schedule_id = 9;</code>
     * @return The towerScheduleId.
     */
    @java.lang.Override
    public int getTowerScheduleId() {
      return towerScheduleId_;
    }

    public static final int SCHEDULE_START_TIME_FIELD_NUMBER = 14;
    private int scheduleStartTime_;
    /**
     * <code>uint32 schedule_start_time = 14;</code>
     * @return The scheduleStartTime.
     */
    @java.lang.Override
    public int getScheduleStartTime() {
      return scheduleStartTime_;
    }

    public static final int OJCGNKBJNBG_FIELD_NUMBER = 13;
    private int oJCGNKBJNBG_;
    /**
     * <code>uint32 OJCGNKBJNBG = 13;</code>
     * @return The oJCGNKBJNBG.
     */
    @java.lang.Override
    public int getOJCGNKBJNBG() {
      return oJCGNKBJNBG_;
    }

    public static final int CLDPGFCBJEA_FIELD_NUMBER = 2;
    private int cLDPGFCBJEA_;
    /**
     * <code>uint32 CLDPGFCBJEA = 2;</code>
     * @return The cLDPGFCBJEA.
     */
    @java.lang.Override
    public int getCLDPGFCBJEA() {
      return cLDPGFCBJEA_;
    }

    public static final int IS_FINISHED_ENTRANCE_FLOOR_FIELD_NUMBER = 4;
    private boolean isFinishedEntranceFloor_;
    /**
     * <code>bool is_finished_entrance_floor = 4;</code>
     * @return The isFinishedEntranceFloor.
     */
    @java.lang.Override
    public boolean getIsFinishedEntranceFloor() {
      return isFinishedEntranceFloor_;
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
      if (cLDPGFCBJEA_ != 0) {
        output.writeUInt32(2, cLDPGFCBJEA_);
      }
      if (isFinishedEntranceFloor_ != false) {
        output.writeBool(4, isFinishedEntranceFloor_);
      }
      if (iPKPGKDBNBL_ != 0) {
        output.writeUInt32(5, iPKPGKDBNBL_);
      }
      if (towerScheduleId_ != 0) {
        output.writeUInt32(9, towerScheduleId_);
      }
      if (oJCGNKBJNBG_ != 0) {
        output.writeUInt32(13, oJCGNKBJNBG_);
      }
      if (scheduleStartTime_ != 0) {
        output.writeUInt32(14, scheduleStartTime_);
      }
      if (nextScheduleChangeTime_ != 0) {
        output.writeUInt32(15, nextScheduleChangeTime_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cLDPGFCBJEA_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, cLDPGFCBJEA_);
      }
      if (isFinishedEntranceFloor_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isFinishedEntranceFloor_);
      }
      if (iPKPGKDBNBL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, iPKPGKDBNBL_);
      }
      if (towerScheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, towerScheduleId_);
      }
      if (oJCGNKBJNBG_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, oJCGNKBJNBG_);
      }
      if (scheduleStartTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, scheduleStartTime_);
      }
      if (nextScheduleChangeTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, nextScheduleChangeTime_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify other = (emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify) obj;

      if (getIPKPGKDBNBL()
          != other.getIPKPGKDBNBL()) return false;
      if (getNextScheduleChangeTime()
          != other.getNextScheduleChangeTime()) return false;
      if (getTowerScheduleId()
          != other.getTowerScheduleId()) return false;
      if (getScheduleStartTime()
          != other.getScheduleStartTime()) return false;
      if (getOJCGNKBJNBG()
          != other.getOJCGNKBJNBG()) return false;
      if (getCLDPGFCBJEA()
          != other.getCLDPGFCBJEA()) return false;
      if (getIsFinishedEntranceFloor()
          != other.getIsFinishedEntranceFloor()) return false;
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
      hash = (37 * hash) + IPKPGKDBNBL_FIELD_NUMBER;
      hash = (53 * hash) + getIPKPGKDBNBL();
      hash = (37 * hash) + NEXT_SCHEDULE_CHANGE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getNextScheduleChangeTime();
      hash = (37 * hash) + TOWER_SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTowerScheduleId();
      hash = (37 * hash) + SCHEDULE_START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleStartTime();
      hash = (37 * hash) + OJCGNKBJNBG_FIELD_NUMBER;
      hash = (53 * hash) + getOJCGNKBJNBG();
      hash = (37 * hash) + CLDPGFCBJEA_FIELD_NUMBER;
      hash = (53 * hash) + getCLDPGFCBJEA();
      hash = (37 * hash) + IS_FINISHED_ENTRANCE_FLOOR_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinishedEntranceFloor());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify prototype) {
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
     * CmdId: 28206
     * Obf: FDNCNACOCMJ
     * </pre>
     *
     * Protobuf type {@code TowerBriefDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TowerBriefDataNotify)
        emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.internal_static_TowerBriefDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.internal_static_TowerBriefDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify.class, emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify.newBuilder()
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
        iPKPGKDBNBL_ = 0;

        nextScheduleChangeTime_ = 0;

        towerScheduleId_ = 0;

        scheduleStartTime_ = 0;

        oJCGNKBJNBG_ = 0;

        cLDPGFCBJEA_ = 0;

        isFinishedEntranceFloor_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.internal_static_TowerBriefDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify build() {
        emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify buildPartial() {
        emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify result = new emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify(this);
        result.iPKPGKDBNBL_ = iPKPGKDBNBL_;
        result.nextScheduleChangeTime_ = nextScheduleChangeTime_;
        result.towerScheduleId_ = towerScheduleId_;
        result.scheduleStartTime_ = scheduleStartTime_;
        result.oJCGNKBJNBG_ = oJCGNKBJNBG_;
        result.cLDPGFCBJEA_ = cLDPGFCBJEA_;
        result.isFinishedEntranceFloor_ = isFinishedEntranceFloor_;
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
        if (other instanceof emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify) {
          return mergeFrom((emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify other) {
        if (other == emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify.getDefaultInstance()) return this;
        if (other.getIPKPGKDBNBL() != 0) {
          setIPKPGKDBNBL(other.getIPKPGKDBNBL());
        }
        if (other.getNextScheduleChangeTime() != 0) {
          setNextScheduleChangeTime(other.getNextScheduleChangeTime());
        }
        if (other.getTowerScheduleId() != 0) {
          setTowerScheduleId(other.getTowerScheduleId());
        }
        if (other.getScheduleStartTime() != 0) {
          setScheduleStartTime(other.getScheduleStartTime());
        }
        if (other.getOJCGNKBJNBG() != 0) {
          setOJCGNKBJNBG(other.getOJCGNKBJNBG());
        }
        if (other.getCLDPGFCBJEA() != 0) {
          setCLDPGFCBJEA(other.getCLDPGFCBJEA());
        }
        if (other.getIsFinishedEntranceFloor() != false) {
          setIsFinishedEntranceFloor(other.getIsFinishedEntranceFloor());
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
        emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int iPKPGKDBNBL_ ;
      /**
       * <code>uint32 IPKPGKDBNBL = 5;</code>
       * @return The iPKPGKDBNBL.
       */
      @java.lang.Override
      public int getIPKPGKDBNBL() {
        return iPKPGKDBNBL_;
      }
      /**
       * <code>uint32 IPKPGKDBNBL = 5;</code>
       * @param value The iPKPGKDBNBL to set.
       * @return This builder for chaining.
       */
      public Builder setIPKPGKDBNBL(int value) {
        
        iPKPGKDBNBL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 IPKPGKDBNBL = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIPKPGKDBNBL() {
        
        iPKPGKDBNBL_ = 0;
        onChanged();
        return this;
      }

      private int nextScheduleChangeTime_ ;
      /**
       * <code>uint32 next_schedule_change_time = 15;</code>
       * @return The nextScheduleChangeTime.
       */
      @java.lang.Override
      public int getNextScheduleChangeTime() {
        return nextScheduleChangeTime_;
      }
      /**
       * <code>uint32 next_schedule_change_time = 15;</code>
       * @param value The nextScheduleChangeTime to set.
       * @return This builder for chaining.
       */
      public Builder setNextScheduleChangeTime(int value) {
        
        nextScheduleChangeTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 next_schedule_change_time = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearNextScheduleChangeTime() {
        
        nextScheduleChangeTime_ = 0;
        onChanged();
        return this;
      }

      private int towerScheduleId_ ;
      /**
       * <code>uint32 tower_schedule_id = 9;</code>
       * @return The towerScheduleId.
       */
      @java.lang.Override
      public int getTowerScheduleId() {
        return towerScheduleId_;
      }
      /**
       * <code>uint32 tower_schedule_id = 9;</code>
       * @param value The towerScheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setTowerScheduleId(int value) {
        
        towerScheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 tower_schedule_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearTowerScheduleId() {
        
        towerScheduleId_ = 0;
        onChanged();
        return this;
      }

      private int scheduleStartTime_ ;
      /**
       * <code>uint32 schedule_start_time = 14;</code>
       * @return The scheduleStartTime.
       */
      @java.lang.Override
      public int getScheduleStartTime() {
        return scheduleStartTime_;
      }
      /**
       * <code>uint32 schedule_start_time = 14;</code>
       * @param value The scheduleStartTime to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleStartTime(int value) {
        
        scheduleStartTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_start_time = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleStartTime() {
        
        scheduleStartTime_ = 0;
        onChanged();
        return this;
      }

      private int oJCGNKBJNBG_ ;
      /**
       * <code>uint32 OJCGNKBJNBG = 13;</code>
       * @return The oJCGNKBJNBG.
       */
      @java.lang.Override
      public int getOJCGNKBJNBG() {
        return oJCGNKBJNBG_;
      }
      /**
       * <code>uint32 OJCGNKBJNBG = 13;</code>
       * @param value The oJCGNKBJNBG to set.
       * @return This builder for chaining.
       */
      public Builder setOJCGNKBJNBG(int value) {
        
        oJCGNKBJNBG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 OJCGNKBJNBG = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearOJCGNKBJNBG() {
        
        oJCGNKBJNBG_ = 0;
        onChanged();
        return this;
      }

      private int cLDPGFCBJEA_ ;
      /**
       * <code>uint32 CLDPGFCBJEA = 2;</code>
       * @return The cLDPGFCBJEA.
       */
      @java.lang.Override
      public int getCLDPGFCBJEA() {
        return cLDPGFCBJEA_;
      }
      /**
       * <code>uint32 CLDPGFCBJEA = 2;</code>
       * @param value The cLDPGFCBJEA to set.
       * @return This builder for chaining.
       */
      public Builder setCLDPGFCBJEA(int value) {
        
        cLDPGFCBJEA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 CLDPGFCBJEA = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCLDPGFCBJEA() {
        
        cLDPGFCBJEA_ = 0;
        onChanged();
        return this;
      }

      private boolean isFinishedEntranceFloor_ ;
      /**
       * <code>bool is_finished_entrance_floor = 4;</code>
       * @return The isFinishedEntranceFloor.
       */
      @java.lang.Override
      public boolean getIsFinishedEntranceFloor() {
        return isFinishedEntranceFloor_;
      }
      /**
       * <code>bool is_finished_entrance_floor = 4;</code>
       * @param value The isFinishedEntranceFloor to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinishedEntranceFloor(boolean value) {
        
        isFinishedEntranceFloor_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finished_entrance_floor = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinishedEntranceFloor() {
        
        isFinishedEntranceFloor_ = false;
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


      // @@protoc_insertion_point(builder_scope:TowerBriefDataNotify)
    }

    // @@protoc_insertion_point(class_scope:TowerBriefDataNotify)
    private static final emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify();
    }

    public static emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TowerBriefDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<TowerBriefDataNotify>() {
      @java.lang.Override
      public TowerBriefDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TowerBriefDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TowerBriefDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TowerBriefDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TowerBriefDataNotifyOuterClass.TowerBriefDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TowerBriefDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TowerBriefDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032TowerBriefDataNotify.proto\"\324\001\n\024TowerBr" +
      "iefDataNotify\022\023\n\013IPKPGKDBNBL\030\005 \001(\r\022!\n\031ne" +
      "xt_schedule_change_time\030\017 \001(\r\022\031\n\021tower_s" +
      "chedule_id\030\t \001(\r\022\033\n\023schedule_start_time\030" +
      "\016 \001(\r\022\023\n\013OJCGNKBJNBG\030\r \001(\r\022\023\n\013CLDPGFCBJE" +
      "A\030\002 \001(\r\022\"\n\032is_finished_entrance_floor\030\004 " +
      "\001(\010B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TowerBriefDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TowerBriefDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TowerBriefDataNotify_descriptor,
        new java.lang.String[] { "IPKPGKDBNBL", "NextScheduleChangeTime", "TowerScheduleId", "ScheduleStartTime", "OJCGNKBJNBG", "CLDPGFCBJEA", "IsFinishedEntranceFloor", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
