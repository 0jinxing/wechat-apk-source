package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bno extends bsr
{
  public String pQe;
  public String tgu;
  public String wOm;
  public int wPw;
  public String wQm;
  public int wao;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56938);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wQm != null)
        paramArrayOfObject.e(2, this.wQm);
      if (this.pQe != null)
        paramArrayOfObject.e(3, this.pQe);
      paramArrayOfObject.iz(4, this.wPw);
      paramArrayOfObject.iz(5, this.wao);
      if (this.wOm != null)
        paramArrayOfObject.e(6, this.wOm);
      if (this.tgu != null)
        paramArrayOfObject.e(100, this.tgu);
      AppMethodBeat.o(56938);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label698;
    label698: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wQm != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wQm);
      i = paramInt;
      if (this.pQe != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.pQe);
      i = i + e.a.a.b.b.a.bs(4, this.wPw) + e.a.a.b.b.a.bs(5, this.wao);
      paramInt = i;
      if (this.wOm != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wOm);
      i = paramInt;
      if (this.tgu != null)
        i = paramInt + e.a.a.b.b.a.f(100, this.tgu);
      AppMethodBeat.o(56938);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56938);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bno localbno = (bno)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56938);
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
            localbno.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(56938);
          paramInt = i;
          break;
        case 2:
          localbno.wQm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56938);
          paramInt = i;
          break;
        case 3:
          localbno.pQe = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56938);
          paramInt = i;
          break;
        case 4:
          localbno.wPw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56938);
          paramInt = i;
          break;
        case 5:
          localbno.wao = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56938);
          paramInt = i;
          break;
        case 6:
          localbno.wOm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56938);
          paramInt = i;
          break;
        case 100:
          localbno.tgu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56938);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56938);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bno
 * JD-Core Version:    0.6.2
 */