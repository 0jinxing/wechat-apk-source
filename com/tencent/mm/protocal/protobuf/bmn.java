package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bmn extends bsr
{
  public String tgu;
  public String wOm;
  public String wPv;
  public int wPw;
  public String wPx;
  public int wao;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56936);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wPv != null)
        paramArrayOfObject.e(2, this.wPv);
      paramArrayOfObject.iz(3, this.wPw);
      paramArrayOfObject.iz(4, this.wao);
      if (this.wPx != null)
        paramArrayOfObject.e(5, this.wPx);
      if (this.wOm != null)
        paramArrayOfObject.e(7, this.wOm);
      if (this.tgu != null)
        paramArrayOfObject.e(100, this.tgu);
      AppMethodBeat.o(56936);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label698;
    label698: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wPv != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wPv);
      i = i + e.a.a.b.b.a.bs(3, this.wPw) + e.a.a.b.b.a.bs(4, this.wao);
      paramInt = i;
      if (this.wPx != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wPx);
      i = paramInt;
      if (this.wOm != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.wOm);
      paramInt = i;
      if (this.tgu != null)
        paramInt = i + e.a.a.b.b.a.f(100, this.tgu);
      AppMethodBeat.o(56936);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56936);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bmn localbmn = (bmn)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56936);
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
            localbmn.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(56936);
          paramInt = i;
          break;
        case 2:
          localbmn.wPv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56936);
          paramInt = i;
          break;
        case 3:
          localbmn.wPw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56936);
          paramInt = i;
          break;
        case 4:
          localbmn.wao = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56936);
          paramInt = i;
          break;
        case 5:
          localbmn.wPx = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56936);
          paramInt = i;
          break;
        case 7:
          localbmn.wOm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56936);
          paramInt = i;
          break;
        case 100:
          localbmn.tgu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56936);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56936);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bmn
 * JD-Core Version:    0.6.2
 */