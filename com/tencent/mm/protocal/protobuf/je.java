package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class je extends bsr
{
  public int cHF;
  public String tCi;
  public String vKZ;
  public String vLa;
  public String vLb;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48780);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.vKZ != null)
        paramArrayOfObject.e(2, this.vKZ);
      if (this.vLa != null)
        paramArrayOfObject.e(3, this.vLa);
      if (this.tCi != null)
        paramArrayOfObject.e(4, this.tCi);
      if (this.vLb != null)
        paramArrayOfObject.e(5, this.vLb);
      paramArrayOfObject.iz(7, this.cHF);
      AppMethodBeat.o(48780);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label631;
    label631: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vKZ != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vKZ);
      i = paramInt;
      if (this.vLa != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vLa);
      paramInt = i;
      if (this.tCi != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.tCi);
      i = paramInt;
      if (this.vLb != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vLb);
      paramInt = i + e.a.a.b.b.a.bs(7, this.cHF);
      AppMethodBeat.o(48780);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48780);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        je localje = (je)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        case 6:
        default:
          paramInt = -1;
          AppMethodBeat.o(48780);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localje.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(48780);
          paramInt = i;
          break;
        case 2:
          localje.vKZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48780);
          paramInt = i;
          break;
        case 3:
          localje.vLa = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48780);
          paramInt = i;
          break;
        case 4:
          localje.tCi = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48780);
          paramInt = i;
          break;
        case 5:
          localje.vLb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48780);
          paramInt = i;
          break;
        case 7:
          localje.cHF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48780);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48780);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.je
 * JD-Core Version:    0.6.2
 */