package com.tencent.mm.plugin.report.kvdata;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public class log_13905 extends com.tencent.mm.bt.a
{
  public int clientVersion_;
  public int device_;
  public int ds_;
  public int import_ds_;
  public long time_stamp_;
  public long uin_;
  public VoiceInputBehavior viOp_;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(79161);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.viOp_ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: viOp_");
        AppMethodBeat.o(79161);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.import_ds_);
      paramArrayOfObject.iz(2, this.ds_);
      paramArrayOfObject.ai(3, this.uin_);
      paramArrayOfObject.iz(4, this.device_);
      paramArrayOfObject.iz(5, this.clientVersion_);
      paramArrayOfObject.ai(6, this.time_stamp_);
      if (this.viOp_ != null)
      {
        paramArrayOfObject.iy(7, this.viOp_.computeSize());
        this.viOp_.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(79161);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.import_ds_) + 0 + e.a.a.b.b.a.bs(2, this.ds_) + e.a.a.b.b.a.o(3, this.uin_) + e.a.a.b.b.a.bs(4, this.device_) + e.a.a.b.b.a.bs(5, this.clientVersion_) + e.a.a.b.b.a.o(6, this.time_stamp_);
        paramInt = i;
        if (this.viOp_ != null)
          paramInt = i + e.a.a.a.ix(7, this.viOp_.computeSize());
        AppMethodBeat.o(79161);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.viOp_ == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: viOp_");
          AppMethodBeat.o(79161);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(79161);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        log_13905 locallog_13905 = (log_13905)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(79161);
          break;
        case 1:
          locallog_13905.import_ds_ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(79161);
          paramInt = 0;
          break;
        case 2:
          locallog_13905.ds_ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(79161);
          paramInt = 0;
          break;
        case 3:
          locallog_13905.uin_ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(79161);
          paramInt = 0;
          break;
        case 4:
          locallog_13905.device_ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(79161);
          paramInt = 0;
          break;
        case 5:
          locallog_13905.clientVersion_ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(79161);
          paramInt = 0;
          break;
        case 6:
          locallog_13905.time_stamp_ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(79161);
          paramInt = 0;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new VoiceInputBehavior();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((VoiceInputBehavior)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locallog_13905.viOp_ = ((VoiceInputBehavior)localObject1);
          }
          AppMethodBeat.o(79161);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(79161);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.kvdata.log_13905
 * JD-Core Version:    0.6.2
 */