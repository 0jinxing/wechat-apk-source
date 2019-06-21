package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class fw extends bsr
{
  public String csB;
  public LinkedList<String> vIa;
  public boolean vIb;
  public int vIc;

  public fw()
  {
    AppMethodBeat.i(102370);
    this.vIa = new LinkedList();
    AppMethodBeat.o(102370);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(102371);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.csB != null)
        paramArrayOfObject.e(2, this.csB);
      paramArrayOfObject.e(3, 1, this.vIa);
      paramArrayOfObject.aO(4, this.vIb);
      paramArrayOfObject.iz(5, this.vIc);
      AppMethodBeat.o(102371);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label539;
    label539: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.csB != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.csB);
      paramInt = i + e.a.a.a.c(3, 1, this.vIa) + (e.a.a.b.b.a.fv(4) + 1) + e.a.a.b.b.a.bs(5, this.vIc);
      AppMethodBeat.o(102371);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vIa.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(102371);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        fw localfw = (fw)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(102371);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localfw.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(102371);
          paramInt = i;
          break;
        case 2:
          localfw.csB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(102371);
          paramInt = i;
          break;
        case 3:
          localfw.vIa.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(102371);
          paramInt = i;
          break;
        case 4:
          localfw.vIb = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(102371);
          paramInt = i;
          break;
        case 5:
          localfw.vIc = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(102371);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(102371);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.fw
 * JD-Core Version:    0.6.2
 */