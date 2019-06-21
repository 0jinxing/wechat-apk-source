package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class re extends bsr
{
  public String vYm;
  public String vYn;
  public String vYo;
  public String vYp;
  public String vYq;
  public long vYr;
  public String vYs;
  public String vYt;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28357);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.vYm != null)
        paramArrayOfObject.e(2, this.vYm);
      if (this.vYn != null)
        paramArrayOfObject.e(3, this.vYn);
      if (this.vYo != null)
        paramArrayOfObject.e(4, this.vYo);
      if (this.vYp != null)
        paramArrayOfObject.e(5, this.vYp);
      if (this.vYq != null)
        paramArrayOfObject.e(6, this.vYq);
      paramArrayOfObject.ai(7, this.vYr);
      if (this.vYs != null)
        paramArrayOfObject.e(8, this.vYs);
      if (this.vYt != null)
        paramArrayOfObject.e(9, this.vYt);
      AppMethodBeat.o(28357);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label838;
    label838: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vYm != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vYm);
      i = paramInt;
      if (this.vYn != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vYn);
      paramInt = i;
      if (this.vYo != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vYo);
      i = paramInt;
      if (this.vYp != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vYp);
      paramInt = i;
      if (this.vYq != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vYq);
      i = paramInt + e.a.a.b.b.a.o(7, this.vYr);
      paramInt = i;
      if (this.vYs != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.vYs);
      i = paramInt;
      if (this.vYt != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.vYt);
      AppMethodBeat.o(28357);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28357);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        re localre = (re)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28357);
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
            localre.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(28357);
          paramInt = i;
          break;
        case 2:
          localre.vYm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28357);
          paramInt = i;
          break;
        case 3:
          localre.vYn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28357);
          paramInt = i;
          break;
        case 4:
          localre.vYo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28357);
          paramInt = i;
          break;
        case 5:
          localre.vYp = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28357);
          paramInt = i;
          break;
        case 6:
          localre.vYq = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28357);
          paramInt = i;
          break;
        case 7:
          localre.vYr = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(28357);
          paramInt = i;
          break;
        case 8:
          localre.vYs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28357);
          paramInt = i;
          break;
        case 9:
          localre.vYt = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28357);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28357);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.re
 * JD-Core Version:    0.6.2
 */