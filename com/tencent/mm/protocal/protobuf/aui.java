package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class aui extends com.tencent.mm.bt.a
{
  public int cIf;
  public String wym;
  public String wyq;
  public String wyr;
  public String wys;
  public bid wyt;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(48874);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wym == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: session_data");
        AppMethodBeat.o(48874);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.cIf);
      if (this.wym != null)
        paramArrayOfObject.e(2, this.wym);
      if (this.wyq != null)
        paramArrayOfObject.e(3, this.wyq);
      if (this.wyr != null)
        paramArrayOfObject.e(4, this.wyr);
      if (this.wys != null)
        paramArrayOfObject.e(5, this.wys);
      if (this.wyt != null)
      {
        paramArrayOfObject.iy(6, this.wyt.computeSize());
        this.wyt.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(48874);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.cIf) + 0;
        paramInt = i;
        if (this.wym != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.wym);
        i = paramInt;
        if (this.wyq != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.wyq);
        int j = i;
        if (this.wyr != null)
          j = i + e.a.a.b.b.a.f(4, this.wyr);
        paramInt = j;
        if (this.wys != null)
          paramInt = j + e.a.a.b.b.a.f(5, this.wys);
        i = paramInt;
        if (this.wyt != null)
          i = paramInt + e.a.a.a.ix(6, this.wyt.computeSize());
        AppMethodBeat.o(48874);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wym == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: session_data");
          AppMethodBeat.o(48874);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(48874);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aui localaui = (aui)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48874);
          break;
        case 1:
          localaui.cIf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48874);
          paramInt = 0;
          break;
        case 2:
          localaui.wym = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48874);
          paramInt = 0;
          break;
        case 3:
          localaui.wyq = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48874);
          paramInt = 0;
          break;
        case 4:
          localaui.wyr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48874);
          paramInt = 0;
          break;
        case 5:
          localaui.wys = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48874);
          paramInt = 0;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bid();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bid)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaui.wyt = ((bid)localObject1);
          }
          AppMethodBeat.o(48874);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(48874);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aui
 * JD-Core Version:    0.6.2
 */