package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bhv extends com.tencent.mm.bt.a
{
  public String key;
  public String pPk;
  public String value;
  public LinkedList<String> wLa;

  public bhv()
  {
    AppMethodBeat.i(90695);
    this.wLa = new LinkedList();
    AppMethodBeat.o(90695);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(90696);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.key == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: key");
        AppMethodBeat.o(90696);
        throw paramArrayOfObject;
      }
      if (this.value == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: value");
        AppMethodBeat.o(90696);
        throw paramArrayOfObject;
      }
      if (this.key != null)
        paramArrayOfObject.e(1, this.key);
      if (this.value != null)
        paramArrayOfObject.e(2, this.value);
      if (this.pPk != null)
        paramArrayOfObject.e(3, this.pPk);
      paramArrayOfObject.e(4, 1, this.wLa);
      AppMethodBeat.o(90696);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.key == null)
        break label512;
    label512: for (i = e.a.a.b.b.a.f(1, this.key) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.value != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.value);
      i = paramInt;
      if (this.pPk != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.pPk);
      paramInt = i + e.a.a.a.c(4, 1, this.wLa);
      AppMethodBeat.o(90696);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wLa.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.key == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: key");
          AppMethodBeat.o(90696);
          throw paramArrayOfObject;
        }
        if (this.value == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: value");
          AppMethodBeat.o(90696);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(90696);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bhv localbhv = (bhv)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(90696);
          break;
        case 1:
          localbhv.key = locala.BTU.readString();
          AppMethodBeat.o(90696);
          paramInt = i;
          break;
        case 2:
          localbhv.value = locala.BTU.readString();
          AppMethodBeat.o(90696);
          paramInt = i;
          break;
        case 3:
          localbhv.pPk = locala.BTU.readString();
          AppMethodBeat.o(90696);
          paramInt = i;
          break;
        case 4:
          localbhv.wLa.add(locala.BTU.readString());
          AppMethodBeat.o(90696);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(90696);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bhv
 * JD-Core Version:    0.6.2
 */