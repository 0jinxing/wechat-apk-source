package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ov extends bsr
{
  public int cIb;
  public int nUf;
  public int pOA;
  public String pPS;
  public String pPT;
  public String vFb;
  public String vFc;
  public String vVW;
  public String vVX;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56749);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.vFb != null)
        paramArrayOfObject.e(2, this.vFb);
      if (this.vFc != null)
        paramArrayOfObject.e(3, this.vFc);
      paramArrayOfObject.iz(4, this.nUf);
      if (this.pPT != null)
        paramArrayOfObject.e(5, this.pPT);
      if (this.pPS != null)
        paramArrayOfObject.e(6, this.pPS);
      paramArrayOfObject.iz(7, this.cIb);
      paramArrayOfObject.iz(8, this.pOA);
      if (this.vVW != null)
        paramArrayOfObject.e(9, this.vVW);
      if (this.vVX != null)
        paramArrayOfObject.e(10, this.vVX);
      AppMethodBeat.o(56749);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label855;
    label855: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vFb != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vFb);
      i = paramInt;
      if (this.vFc != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vFc);
      i += e.a.a.b.b.a.bs(4, this.nUf);
      paramInt = i;
      if (this.pPT != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.pPT);
      i = paramInt;
      if (this.pPS != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.pPS);
      i = i + e.a.a.b.b.a.bs(7, this.cIb) + e.a.a.b.b.a.bs(8, this.pOA);
      paramInt = i;
      if (this.vVW != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.vVW);
      i = paramInt;
      if (this.vVX != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.vVX);
      AppMethodBeat.o(56749);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56749);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ov localov = (ov)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56749);
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
            localov.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(56749);
          paramInt = i;
          break;
        case 2:
          localov.vFb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56749);
          paramInt = i;
          break;
        case 3:
          localov.vFc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56749);
          paramInt = i;
          break;
        case 4:
          localov.nUf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56749);
          paramInt = i;
          break;
        case 5:
          localov.pPT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56749);
          paramInt = i;
          break;
        case 6:
          localov.pPS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56749);
          paramInt = i;
          break;
        case 7:
          localov.cIb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56749);
          paramInt = i;
          break;
        case 8:
          localov.pOA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56749);
          paramInt = i;
          break;
        case 9:
          localov.vVW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56749);
          paramInt = i;
          break;
        case 10:
          localov.vVX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56749);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56749);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ov
 * JD-Core Version:    0.6.2
 */