package com.tencent.mm.plugin.report.kvdata;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public class TableInfo extends com.tencent.mm.bt.a
{
  public long count_;
  public String name_;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(79154);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.name_ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: name_");
        AppMethodBeat.o(79154);
        throw paramArrayOfObject;
      }
      if (this.name_ != null)
        paramArrayOfObject.e(1, this.name_);
      paramArrayOfObject.ai(2, this.count_);
      AppMethodBeat.o(79154);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.name_ == null)
        break label322;
    label322: for (paramInt = e.a.a.b.b.a.f(1, this.name_) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.o(2, this.count_);
      AppMethodBeat.o(79154);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.name_ == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: name_");
          AppMethodBeat.o(79154);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(79154);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        TableInfo localTableInfo = (TableInfo)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(79154);
          paramInt = -1;
          break;
        case 1:
          localTableInfo.name_ = locala.BTU.readString();
          AppMethodBeat.o(79154);
          paramInt = i;
          break;
        case 2:
          localTableInfo.count_ = locala.BTU.ve();
          AppMethodBeat.o(79154);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(79154);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.kvdata.TableInfo
 * JD-Core Version:    0.6.2
 */