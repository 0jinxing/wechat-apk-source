package com.tencent.mm.plugin.report.kvdata;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public class log_14375 extends com.tencent.mm.bt.a
{
  public int clientVersion_;
  public BDStatusInfo dbStatusInfo_;
  public int device_;
  public int ds_;
  public HeavyDetailInfo heavyDetailInfo_;
  public int import_ds_;
  public SDStatusInfo sdStatusInfo_;
  public long time_stamp_;
  public int type_;
  public long uin_;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(79163);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.import_ds_);
      paramArrayOfObject.iz(2, this.ds_);
      paramArrayOfObject.ai(3, this.uin_);
      paramArrayOfObject.iz(4, this.device_);
      paramArrayOfObject.iz(5, this.clientVersion_);
      paramArrayOfObject.ai(6, this.time_stamp_);
      paramArrayOfObject.iz(7, this.type_);
      if (this.dbStatusInfo_ != null)
      {
        paramArrayOfObject.iy(8, this.dbStatusInfo_.computeSize());
        this.dbStatusInfo_.writeFields(paramArrayOfObject);
      }
      if (this.sdStatusInfo_ != null)
      {
        paramArrayOfObject.iy(9, this.sdStatusInfo_.computeSize());
        this.sdStatusInfo_.writeFields(paramArrayOfObject);
      }
      if (this.heavyDetailInfo_ != null)
      {
        paramArrayOfObject.iy(10, this.heavyDetailInfo_.computeSize());
        this.heavyDetailInfo_.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(79163);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.import_ds_) + 0 + e.a.a.b.b.a.bs(2, this.ds_) + e.a.a.b.b.a.o(3, this.uin_) + e.a.a.b.b.a.bs(4, this.device_) + e.a.a.b.b.a.bs(5, this.clientVersion_) + e.a.a.b.b.a.o(6, this.time_stamp_) + e.a.a.b.b.a.bs(7, this.type_);
        i = paramInt;
        if (this.dbStatusInfo_ != null)
          i = paramInt + e.a.a.a.ix(8, this.dbStatusInfo_.computeSize());
        paramInt = i;
        if (this.sdStatusInfo_ != null)
          paramInt = i + e.a.a.a.ix(9, this.sdStatusInfo_.computeSize());
        i = paramInt;
        if (this.heavyDetailInfo_ != null)
          i = paramInt + e.a.a.a.ix(10, this.heavyDetailInfo_.computeSize());
        AppMethodBeat.o(79163);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(79163);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        log_14375 locallog_14375 = (log_14375)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(79163);
          break;
        case 1:
          locallog_14375.import_ds_ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(79163);
          paramInt = 0;
          break;
        case 2:
          locallog_14375.ds_ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(79163);
          paramInt = 0;
          break;
        case 3:
          locallog_14375.uin_ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(79163);
          paramInt = 0;
          break;
        case 4:
          locallog_14375.device_ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(79163);
          paramInt = 0;
          break;
        case 5:
          locallog_14375.clientVersion_ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(79163);
          paramInt = 0;
          break;
        case 6:
          locallog_14375.time_stamp_ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(79163);
          paramInt = 0;
          break;
        case 7:
          locallog_14375.type_ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(79163);
          paramInt = 0;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new BDStatusInfo();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((BDStatusInfo)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locallog_14375.dbStatusInfo_ = ((BDStatusInfo)localObject1);
          }
          AppMethodBeat.o(79163);
          paramInt = 0;
          break;
        case 9:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SDStatusInfo();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locallog_14375.sdStatusInfo_ = paramArrayOfObject;
          }
          AppMethodBeat.o(79163);
          paramInt = 0;
          break;
        case 10:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new HeavyDetailInfo();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            locallog_14375.heavyDetailInfo_ = paramArrayOfObject;
          }
          AppMethodBeat.o(79163);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(79163);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.kvdata.log_14375
 * JD-Core Version:    0.6.2
 */