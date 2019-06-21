package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ot extends bsr
{
  public String kfT;
  public int nUf;
  public String nickname;
  public String pPH;
  public String pPI;
  public String pPZ;
  public String pPw;
  public String pQc;
  public String vVT;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56746);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.nUf);
      if (this.kfT != null)
        paramArrayOfObject.e(3, this.kfT);
      if (this.pPZ != null)
        paramArrayOfObject.e(4, this.pPZ);
      if (this.vVT != null)
        paramArrayOfObject.e(5, this.vVT);
      if (this.pPH != null)
        paramArrayOfObject.e(6, this.pPH);
      if (this.pPI != null)
        paramArrayOfObject.e(7, this.pPI);
      if (this.pQc != null)
        paramArrayOfObject.e(8, this.pQc);
      if (this.nickname != null)
        paramArrayOfObject.e(9, this.nickname);
      if (this.pPw != null)
        paramArrayOfObject.e(10, this.pPw);
      AppMethodBeat.o(56746);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label890;
    label890: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.nUf);
      paramInt = i;
      if (this.kfT != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kfT);
      i = paramInt;
      if (this.pPZ != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.pPZ);
      paramInt = i;
      if (this.vVT != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vVT);
      int j = paramInt;
      if (this.pPH != null)
        j = paramInt + e.a.a.b.b.a.f(6, this.pPH);
      i = j;
      if (this.pPI != null)
        i = j + e.a.a.b.b.a.f(7, this.pPI);
      paramInt = i;
      if (this.pQc != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.pQc);
      i = paramInt;
      if (this.nickname != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.nickname);
      paramInt = i;
      if (this.pPw != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.pPw);
      AppMethodBeat.o(56746);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56746);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ot localot = (ot)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56746);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localot.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(56746);
          paramInt = i;
          break;
        case 2:
          localot.nUf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56746);
          paramInt = i;
          break;
        case 3:
          localot.kfT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56746);
          paramInt = i;
          break;
        case 4:
          localot.pPZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56746);
          paramInt = i;
          break;
        case 5:
          localot.vVT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56746);
          paramInt = i;
          break;
        case 6:
          localot.pPH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56746);
          paramInt = i;
          break;
        case 7:
          localot.pPI = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56746);
          paramInt = i;
          break;
        case 8:
          localot.pQc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56746);
          paramInt = i;
          break;
        case 9:
          localot.nickname = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56746);
          paramInt = i;
          break;
        case 10:
          localot.pPw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56746);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56746);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ot
 * JD-Core Version:    0.6.2
 */