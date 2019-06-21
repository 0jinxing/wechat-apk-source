package com.tencent.mm.plugin.report.kvdata;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public class log_13835 extends com.tencent.mm.bt.a
{
  public int clientVersion_;
  public String currChatName_;
  public int device_;
  public int ds_;
  public int import_ds_;
  public LinkedList<IMBehavior> oplist_;
  public long time_stamp_;
  public long uin_;

  public log_13835()
  {
    AppMethodBeat.i(79159);
    this.oplist_ = new LinkedList();
    AppMethodBeat.o(79159);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(79160);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.currChatName_ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: currChatName_");
        AppMethodBeat.o(79160);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.import_ds_);
      paramArrayOfObject.iz(2, this.ds_);
      paramArrayOfObject.ai(3, this.uin_);
      paramArrayOfObject.iz(4, this.device_);
      paramArrayOfObject.iz(5, this.clientVersion_);
      paramArrayOfObject.ai(6, this.time_stamp_);
      if (this.currChatName_ != null)
        paramArrayOfObject.e(7, this.currChatName_);
      paramArrayOfObject.e(8, 8, this.oplist_);
      AppMethodBeat.o(79160);
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
        if (this.currChatName_ != null)
          paramInt = i + e.a.a.b.b.a.f(7, this.currChatName_);
        paramInt += e.a.a.a.c(8, 8, this.oplist_);
        AppMethodBeat.o(79160);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.oplist_.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.currChatName_ == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: currChatName_");
          AppMethodBeat.o(79160);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(79160);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        log_13835 locallog_13835 = (log_13835)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(79160);
          break;
        case 1:
          locallog_13835.import_ds_ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(79160);
          paramInt = 0;
          break;
        case 2:
          locallog_13835.ds_ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(79160);
          paramInt = 0;
          break;
        case 3:
          locallog_13835.uin_ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(79160);
          paramInt = 0;
          break;
        case 4:
          locallog_13835.device_ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(79160);
          paramInt = 0;
          break;
        case 5:
          locallog_13835.clientVersion_ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(79160);
          paramInt = 0;
          break;
        case 6:
          locallog_13835.time_stamp_ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(79160);
          paramInt = 0;
          break;
        case 7:
          locallog_13835.currChatName_ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(79160);
          paramInt = 0;
          break;
        case 8:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new IMBehavior();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locallog_13835.oplist_.add(paramArrayOfObject);
          }
          AppMethodBeat.o(79160);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(79160);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.kvdata.log_13835
 * JD-Core Version:    0.6.2
 */