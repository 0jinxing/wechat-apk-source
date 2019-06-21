package com.tencent.mm.plugin.report.kvdata;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public class SDStatusInfo extends com.tencent.mm.bt.a
{
  public long eAvailableBlockCount_;
  public int eAvailablePer_;
  public long eAvailableSize_;
  public long eBlockCount_;
  public long eBlockSize_;
  public String ePath_;
  public long eTotalSize_;
  public String fSystem_;
  public int hasUnRemovable_;
  public int ratioHeavy_;
  public String root_;
  public long sAvailableBlockCount_;
  public int sAvailablePer_;
  public long sAvailableSize_;
  public long sBlockCount_;
  public long sBlockSize_;
  public long sTotalSize_;
  public int sizeHeavy_;
  public int useExternal_;
  public int weChatPer_;
  public WeChatSDInfo weChatSDInfo_;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(79152);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.weChatSDInfo_ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: weChatSDInfo_");
        AppMethodBeat.o(79152);
        throw paramArrayOfObject;
      }
      if (this.weChatSDInfo_ != null)
      {
        paramArrayOfObject.iy(1, this.weChatSDInfo_.computeSize());
        this.weChatSDInfo_.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.weChatPer_);
      paramArrayOfObject.iz(3, this.sizeHeavy_);
      paramArrayOfObject.iz(4, this.ratioHeavy_);
      paramArrayOfObject.iz(5, this.useExternal_);
      paramArrayOfObject.iz(6, this.hasUnRemovable_);
      paramArrayOfObject.ai(7, this.sBlockSize_);
      paramArrayOfObject.ai(8, this.sBlockCount_);
      paramArrayOfObject.ai(9, this.sTotalSize_);
      paramArrayOfObject.ai(10, this.sAvailableBlockCount_);
      paramArrayOfObject.ai(11, this.sAvailableSize_);
      paramArrayOfObject.iz(12, this.sAvailablePer_);
      paramArrayOfObject.ai(13, this.eBlockSize_);
      paramArrayOfObject.ai(14, this.eBlockCount_);
      paramArrayOfObject.ai(15, this.eTotalSize_);
      paramArrayOfObject.ai(16, this.eAvailableBlockCount_);
      paramArrayOfObject.ai(17, this.eAvailableSize_);
      paramArrayOfObject.iz(18, this.eAvailablePer_);
      if (this.ePath_ != null)
        paramArrayOfObject.e(19, this.ePath_);
      if (this.root_ != null)
        paramArrayOfObject.e(20, this.root_);
      if (this.fSystem_ != null)
        paramArrayOfObject.e(21, this.fSystem_);
      AppMethodBeat.o(79152);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.weChatSDInfo_ == null)
        break label1364;
    label1364: for (paramInt = e.a.a.a.ix(1, this.weChatSDInfo_.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.weChatPer_) + e.a.a.b.b.a.bs(3, this.sizeHeavy_) + e.a.a.b.b.a.bs(4, this.ratioHeavy_) + e.a.a.b.b.a.bs(5, this.useExternal_) + e.a.a.b.b.a.bs(6, this.hasUnRemovable_) + e.a.a.b.b.a.o(7, this.sBlockSize_) + e.a.a.b.b.a.o(8, this.sBlockCount_) + e.a.a.b.b.a.o(9, this.sTotalSize_) + e.a.a.b.b.a.o(10, this.sAvailableBlockCount_) + e.a.a.b.b.a.o(11, this.sAvailableSize_) + e.a.a.b.b.a.bs(12, this.sAvailablePer_) + e.a.a.b.b.a.o(13, this.eBlockSize_) + e.a.a.b.b.a.o(14, this.eBlockCount_) + e.a.a.b.b.a.o(15, this.eTotalSize_) + e.a.a.b.b.a.o(16, this.eAvailableBlockCount_) + e.a.a.b.b.a.o(17, this.eAvailableSize_) + e.a.a.b.b.a.bs(18, this.eAvailablePer_);
      i = paramInt;
      if (this.ePath_ != null)
        i = paramInt + e.a.a.b.b.a.f(19, this.ePath_);
      paramInt = i;
      if (this.root_ != null)
        paramInt = i + e.a.a.b.b.a.f(20, this.root_);
      i = paramInt;
      if (this.fSystem_ != null)
        i = paramInt + e.a.a.b.b.a.f(21, this.fSystem_);
      AppMethodBeat.o(79152);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.weChatSDInfo_ == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: weChatSDInfo_");
          AppMethodBeat.o(79152);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(79152);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        SDStatusInfo localSDStatusInfo = (SDStatusInfo)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(79152);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new WeChatSDInfo();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((WeChatSDInfo)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localSDStatusInfo.weChatSDInfo_ = ((WeChatSDInfo)localObject1);
          }
          AppMethodBeat.o(79152);
          paramInt = i;
          break;
        case 2:
          localSDStatusInfo.weChatPer_ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(79152);
          paramInt = i;
          break;
        case 3:
          localSDStatusInfo.sizeHeavy_ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(79152);
          paramInt = i;
          break;
        case 4:
          localSDStatusInfo.ratioHeavy_ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(79152);
          paramInt = i;
          break;
        case 5:
          localSDStatusInfo.useExternal_ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(79152);
          paramInt = i;
          break;
        case 6:
          localSDStatusInfo.hasUnRemovable_ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(79152);
          paramInt = i;
          break;
        case 7:
          localSDStatusInfo.sBlockSize_ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(79152);
          paramInt = i;
          break;
        case 8:
          localSDStatusInfo.sBlockCount_ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(79152);
          paramInt = i;
          break;
        case 9:
          localSDStatusInfo.sTotalSize_ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(79152);
          paramInt = i;
          break;
        case 10:
          localSDStatusInfo.sAvailableBlockCount_ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(79152);
          paramInt = i;
          break;
        case 11:
          localSDStatusInfo.sAvailableSize_ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(79152);
          paramInt = i;
          break;
        case 12:
          localSDStatusInfo.sAvailablePer_ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(79152);
          paramInt = i;
          break;
        case 13:
          localSDStatusInfo.eBlockSize_ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(79152);
          paramInt = i;
          break;
        case 14:
          localSDStatusInfo.eBlockCount_ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(79152);
          paramInt = i;
          break;
        case 15:
          localSDStatusInfo.eTotalSize_ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(79152);
          paramInt = i;
          break;
        case 16:
          localSDStatusInfo.eAvailableBlockCount_ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(79152);
          paramInt = i;
          break;
        case 17:
          localSDStatusInfo.eAvailableSize_ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(79152);
          paramInt = i;
          break;
        case 18:
          localSDStatusInfo.eAvailablePer_ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(79152);
          paramInt = i;
          break;
        case 19:
          localSDStatusInfo.ePath_ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(79152);
          paramInt = i;
          break;
        case 20:
          localSDStatusInfo.root_ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(79152);
          paramInt = i;
          break;
        case 21:
          localSDStatusInfo.fSystem_ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(79152);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(79152);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.kvdata.SDStatusInfo
 * JD-Core Version:    0.6.2
 */