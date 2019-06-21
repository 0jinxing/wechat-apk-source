package com.tencent.mm.plugin.report.kvdata;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class HeavyDetailInfo extends com.tencent.mm.bt.a
{
  public long chatroom_;
  public long contact_;
  public long conversation_;
  public long dbSize_;
  public long favDbSize_;
  public long flag_;
  public long message_;
  public long sdFileRatio_;
  public long sdFileSize_;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(79148);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.flag_);
      paramArrayOfObject.ai(2, this.sdFileSize_);
      paramArrayOfObject.ai(3, this.sdFileRatio_);
      paramArrayOfObject.ai(4, this.dbSize_);
      paramArrayOfObject.ai(5, this.message_);
      paramArrayOfObject.ai(6, this.conversation_);
      paramArrayOfObject.ai(7, this.contact_);
      paramArrayOfObject.ai(8, this.chatroom_);
      paramArrayOfObject.ai(9, this.favDbSize_);
      AppMethodBeat.o(79148);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.o(1, this.flag_) + 0 + e.a.a.b.b.a.o(2, this.sdFileSize_) + e.a.a.b.b.a.o(3, this.sdFileRatio_) + e.a.a.b.b.a.o(4, this.dbSize_) + e.a.a.b.b.a.o(5, this.message_) + e.a.a.b.b.a.o(6, this.conversation_) + e.a.a.b.b.a.o(7, this.contact_) + e.a.a.b.b.a.o(8, this.chatroom_) + e.a.a.b.b.a.o(9, this.favDbSize_);
        AppMethodBeat.o(79148);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(79148);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        HeavyDetailInfo localHeavyDetailInfo = (HeavyDetailInfo)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(79148);
          break;
        case 1:
          localHeavyDetailInfo.flag_ = locala.BTU.ve();
          AppMethodBeat.o(79148);
          paramInt = 0;
          break;
        case 2:
          localHeavyDetailInfo.sdFileSize_ = locala.BTU.ve();
          AppMethodBeat.o(79148);
          paramInt = 0;
          break;
        case 3:
          localHeavyDetailInfo.sdFileRatio_ = locala.BTU.ve();
          AppMethodBeat.o(79148);
          paramInt = 0;
          break;
        case 4:
          localHeavyDetailInfo.dbSize_ = locala.BTU.ve();
          AppMethodBeat.o(79148);
          paramInt = 0;
          break;
        case 5:
          localHeavyDetailInfo.message_ = locala.BTU.ve();
          AppMethodBeat.o(79148);
          paramInt = 0;
          break;
        case 6:
          localHeavyDetailInfo.conversation_ = locala.BTU.ve();
          AppMethodBeat.o(79148);
          paramInt = 0;
          break;
        case 7:
          localHeavyDetailInfo.contact_ = locala.BTU.ve();
          AppMethodBeat.o(79148);
          paramInt = 0;
          break;
        case 8:
          localHeavyDetailInfo.chatroom_ = locala.BTU.ve();
          AppMethodBeat.o(79148);
          paramInt = 0;
          break;
        case 9:
          localHeavyDetailInfo.favDbSize_ = locala.BTU.ve();
          AppMethodBeat.o(79148);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(79148);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.kvdata.HeavyDetailInfo
 * JD-Core Version:    0.6.2
 */