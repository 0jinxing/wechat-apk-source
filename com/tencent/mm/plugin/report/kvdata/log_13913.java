package com.tencent.mm.plugin.report.kvdata;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class log_13913 extends com.tencent.mm.bt.a
{
  public int clientVersion_;
  public int device_;
  public int ds_;
  public String error_;
  public int import_ds_;
  public int scene_;
  public long time_stamp_;
  public long uin_;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(79162);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.import_ds_);
      paramArrayOfObject.iz(2, this.ds_);
      paramArrayOfObject.ai(3, this.uin_);
      paramArrayOfObject.iz(4, this.device_);
      paramArrayOfObject.iz(5, this.clientVersion_);
      paramArrayOfObject.ai(6, this.time_stamp_);
      paramArrayOfObject.iz(7, this.scene_);
      if (this.error_ != null)
        paramArrayOfObject.e(8, this.error_);
      AppMethodBeat.o(79162);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.import_ds_) + 0 + e.a.a.b.b.a.bs(2, this.ds_) + e.a.a.b.b.a.o(3, this.uin_) + e.a.a.b.b.a.bs(4, this.device_) + e.a.a.b.b.a.bs(5, this.clientVersion_) + e.a.a.b.b.a.o(6, this.time_stamp_) + e.a.a.b.b.a.bs(7, this.scene_);
        paramInt = i;
        if (this.error_ != null)
          paramInt = i + e.a.a.b.b.a.f(8, this.error_);
        AppMethodBeat.o(79162);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(79162);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        log_13913 locallog_13913 = (log_13913)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(79162);
          break;
        case 1:
          locallog_13913.import_ds_ = locala.BTU.vd();
          AppMethodBeat.o(79162);
          paramInt = 0;
          break;
        case 2:
          locallog_13913.ds_ = locala.BTU.vd();
          AppMethodBeat.o(79162);
          paramInt = 0;
          break;
        case 3:
          locallog_13913.uin_ = locala.BTU.ve();
          AppMethodBeat.o(79162);
          paramInt = 0;
          break;
        case 4:
          locallog_13913.device_ = locala.BTU.vd();
          AppMethodBeat.o(79162);
          paramInt = 0;
          break;
        case 5:
          locallog_13913.clientVersion_ = locala.BTU.vd();
          AppMethodBeat.o(79162);
          paramInt = 0;
          break;
        case 6:
          locallog_13913.time_stamp_ = locala.BTU.ve();
          AppMethodBeat.o(79162);
          paramInt = 0;
          break;
        case 7:
          locallog_13913.scene_ = locala.BTU.vd();
          AppMethodBeat.o(79162);
          paramInt = 0;
          break;
        case 8:
          locallog_13913.error_ = locala.BTU.readString();
          AppMethodBeat.o(79162);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(79162);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.kvdata.log_13913
 * JD-Core Version:    0.6.2
 */