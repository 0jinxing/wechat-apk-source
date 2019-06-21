package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class blg extends bsr
{
  public String tgu;
  public int wOi;
  public int wOj;
  public ha wOk;
  public int wOl;
  public String wOm;
  public int wao;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56925);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wOi);
      paramArrayOfObject.iz(3, this.wOj);
      if (this.wOk != null)
      {
        paramArrayOfObject.iy(4, this.wOk.computeSize());
        this.wOk.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(5, this.wao);
      paramArrayOfObject.iz(6, this.wOl);
      if (this.wOm != null)
        paramArrayOfObject.e(7, this.wOm);
      if (this.tgu != null)
        paramArrayOfObject.e(100, this.tgu);
      AppMethodBeat.o(56925);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label828;
    label828: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wOi) + e.a.a.b.b.a.bs(3, this.wOj);
      paramInt = i;
      if (this.wOk != null)
        paramInt = i + e.a.a.a.ix(4, this.wOk.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(5, this.wao) + e.a.a.b.b.a.bs(6, this.wOl);
      paramInt = i;
      if (this.wOm != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.wOm);
      i = paramInt;
      if (this.tgu != null)
        i = paramInt + e.a.a.b.b.a.f(100, this.tgu);
      AppMethodBeat.o(56925);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56925);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        blg localblg = (blg)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56925);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localblg.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(56925);
          paramInt = i;
          break;
        case 2:
          localblg.wOi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56925);
          paramInt = i;
          break;
        case 3:
          localblg.wOj = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56925);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ha();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localblg.wOk = paramArrayOfObject;
          }
          AppMethodBeat.o(56925);
          paramInt = i;
          break;
        case 5:
          localblg.wao = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56925);
          paramInt = i;
          break;
        case 6:
          localblg.wOl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56925);
          paramInt = i;
          break;
        case 7:
          localblg.wOm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56925);
          paramInt = i;
          break;
        case 100:
          localblg.tgu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56925);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56925);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.blg
 * JD-Core Version:    0.6.2
 */