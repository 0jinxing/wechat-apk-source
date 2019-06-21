package com.tencent.mm.plugin.report.kvdata;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class log_13532 extends com.tencent.mm.bt.a
{
  public int clientVersion_;
  public int device_;
  public int ds_;
  public int import_ds_;
  public long time_stamp_;
  public int type;
  public long uin_;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(79158);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.import_ds_);
      paramArrayOfObject.iz(2, this.ds_);
      paramArrayOfObject.ai(3, this.uin_);
      paramArrayOfObject.iz(4, this.device_);
      paramArrayOfObject.iz(5, this.clientVersion_);
      paramArrayOfObject.ai(6, this.time_stamp_);
      paramArrayOfObject.iz(7, this.type);
      AppMethodBeat.o(79158);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.import_ds_) + 0 + e.a.a.b.b.a.bs(2, this.ds_) + e.a.a.b.b.a.o(3, this.uin_) + e.a.a.b.b.a.bs(4, this.device_) + e.a.a.b.b.a.bs(5, this.clientVersion_) + e.a.a.b.b.a.o(6, this.time_stamp_) + e.a.a.b.b.a.bs(7, this.type);
        AppMethodBeat.o(79158);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(79158);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        log_13532 locallog_13532 = (log_13532)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(79158);
          break;
        case 1:
          locallog_13532.import_ds_ = locala.BTU.vd();
          AppMethodBeat.o(79158);
          paramInt = 0;
          break;
        case 2:
          locallog_13532.ds_ = locala.BTU.vd();
          AppMethodBeat.o(79158);
          paramInt = 0;
          break;
        case 3:
          locallog_13532.uin_ = locala.BTU.ve();
          AppMethodBeat.o(79158);
          paramInt = 0;
          break;
        case 4:
          locallog_13532.device_ = locala.BTU.vd();
          AppMethodBeat.o(79158);
          paramInt = 0;
          break;
        case 5:
          locallog_13532.clientVersion_ = locala.BTU.vd();
          AppMethodBeat.o(79158);
          paramInt = 0;
          break;
        case 6:
          locallog_13532.time_stamp_ = locala.BTU.ve();
          AppMethodBeat.o(79158);
          paramInt = 0;
          break;
        case 7:
          locallog_13532.type = locala.BTU.vd();
          AppMethodBeat.o(79158);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(79158);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.kvdata.log_13532
 * JD-Core Version:    0.6.2
 */