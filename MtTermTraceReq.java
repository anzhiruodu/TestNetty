package com.ctf.ass_codec.mt_body;

import com.google.protobuf.ByteString;
import com.ctf.ass_public.utils.ConvUtils;
import com.ctf.ass_codec.protobuf.MtProtoMsg;
import com.ctf.ass_codec.struct.MessageBody;
import com.google.protobuf.InvalidProtocolBufferException;
import io.netty.buffer.ByteBuf;
import com.ctf.ass_codec.protobuf.MtProtoMsg.LEVEL;
import com.ctf.ass_codec.protobuf.MtProtoMsg.NETWORK_TYPE;

/*
 * This file is auto generated by *proto_convert*
 *  and should *NOT* be modified manually!!!
 */
public class MtTermTraceReq extends MessageBody {
    //---------------------------------------------------------------------------
    // ALL fields (private)
    //---------------------------------------------------------------------------
    //required fields
    private int status;

    //optional fields
    private LEVEL level;

    //---------------------------------------------------------------------------
    // DEFAULT value for optional fields (private static final)
    //---------------------------------------------------------------------------
    private static final LEVEL DEFAULT_LEVEL = null;

    //---------------------------------------------------------------------------
    // Constructed Function
    //---------------------------------------------------------------------------
    // <status> is *required*
    public MtTermTraceReq(int status) {
        this(status,
             DEFAULT_LEVEL);
    }

    public MtTermTraceReq(int status, LEVEL level) {
        this.status = status;
        this.level = level;
    }

    //---------------------------------------------------------------------------
    // getter Functions
    //---------------------------------------------------------------------------
    //required fields
    public int getStatus() {
        return this.status;
    }

    //optional fields
    public boolean hasLevel() {
        return (this.level != DEFAULT_LEVEL);
    }
    public LEVEL getLevel() {
        return this.level;
    }
    public void setLevel(LEVEL level){
        this.level = level;
    }

    //---------------------------------------------------------------------------
    // decode Function
    //---------------------------------------------------------------------------
    public static MtTermTraceReq parseFrom(byte[] bytes) throws InvalidProtocolBufferException {
        MtProtoMsg.TermTraceRequest _request = MtProtoMsg.TermTraceRequest.parseFrom(bytes);

        //required fields
        int status = _request.getStatus();

        //decode
        MtTermTraceReq _req = new MtTermTraceReq(status);

        //optional fields
        if (_request.hasLevel()) {
            _req.level = _request.getLevel();
        }

        //return
        return _req;
    }

    //---------------------------------------------------------------------------
    // encode Function
    //---------------------------------------------------------------------------
    @Override
    public int toBytes(ByteBuf buf) {
        MtProtoMsg.TermTraceRequest.Builder builder = MtProtoMsg.TermTraceRequest.newBuilder();

        //required fields
        builder.setStatus(status);

        //optional fields
        if (hasLevel()) {
            builder.setLevel(level);
        }

        //encode
        byte[] bytes = builder.build().toByteArray();
        buf.writeBytes(bytes);

        //return
        return bytes.length;
    }

    //---------------------------------------------------------------------------
    // toString Function
    //---------------------------------------------------------------------------
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("MtTermTraceReq { ");

        //required fields
        sb.append("status:").append(status).append(",");

        //optional fields
        if (hasLevel()) {
            sb.append("level:").append(level).append(",");
        }

        //remove last ','
        sb.setLength(sb.length() - 1);

        sb.append(" }");

        return sb.toString();
    }
}

