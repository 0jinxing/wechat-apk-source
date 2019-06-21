package com.tencent.mm.plugin.report.kvdata;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public class BDStatusInfo extends com.tencent.mm.bt.a
{
  public long favDBSize_;
  public long mmDBSize_;
  public int mmDBTableCount_;
  public long snsDBSize_;
  public LinkedList<TableInfo> tableList_;

  public BDStatusInfo()
  {
    AppMethodBeat.i(79146);
    this.tableList_ = new LinkedList();
    AppMethodBeat.o(79146);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(79147);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.mmDBSize_);
      paramArrayOfObject.ai(2, this.snsDBSize_);
      paramArrayOfObject.iz(3, this.mmDBTableCount_);
      paramArrayOfObject.e(4, 8, this.tableList_);
      paramArrayOfObject.ai(5, this.favDBSize_);
      AppMethodBeat.o(79147);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.o(1, this.mmDBSize_) + 0 + e.a.a.b.b.a.o(2, this.snsDBSize_) + e.a.a.b.b.a.bs(3, this.mmDBTableCount_) + e.a.a.a.c(4, 8, this.tableList_) + e.a.a.b.b.a.o(5, this.favDBSize_);
        AppMethodBeat.o(79147);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.tableList_.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(79147);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        BDStatusInfo localBDStatusInfo = (BDStatusInfo)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(79147);
          break;
        case 1:
          localBDStatusInfo.mmDBSize_ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(79147);
          paramInt = 0;
          break;
        case 2:
          localBDStatusInfo.snsDBSize_ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(79147);
          paramInt = 0;
          break;
        case 3:
          localBDStatusInfo.mmDBTableCount_ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(79147);
          paramInt = 0;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new TableInfo();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((TableInfo)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localBDStatusInfo.tableList_.add(localObject1);
          }
          AppMethodBeat.o(79147);
          paramInt = 0;
          break;
        case 5:
          localBDStatusInfo.favDBSize_ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(79147);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(79147);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.kvdata.BDStatusInfo
 * JD-Core Version:    0.6.2
 */