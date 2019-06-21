package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class rl extends bsr
{
  public int Scene;
  public String Title;
  public String fJU;
  public String fKh;
  public String vYH;
  public String vYI;
  public String vYJ;
  public String vYK;
  public String vYL;
  public String vYM;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(105144);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.fJU != null)
        paramArrayOfObject.e(2, this.fJU);
      if (this.Title != null)
        paramArrayOfObject.e(3, this.Title);
      if (this.vYH != null)
        paramArrayOfObject.e(4, this.vYH);
      if (this.vYI != null)
        paramArrayOfObject.e(5, this.vYI);
      if (this.vYJ != null)
        paramArrayOfObject.e(6, this.vYJ);
      if (this.vYK != null)
        paramArrayOfObject.e(7, this.vYK);
      if (this.vYL != null)
        paramArrayOfObject.e(8, this.vYL);
      if (this.fKh != null)
        paramArrayOfObject.e(9, this.fKh);
      paramArrayOfObject.iz(10, this.Scene);
      if (this.vYM != null)
        paramArrayOfObject.e(11, this.vYM);
      AppMethodBeat.o(105144);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label954;
    label954: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.fJU != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.fJU);
      i = paramInt;
      if (this.Title != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.Title);
      paramInt = i;
      if (this.vYH != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vYH);
      int j = paramInt;
      if (this.vYI != null)
        j = paramInt + e.a.a.b.b.a.f(5, this.vYI);
      i = j;
      if (this.vYJ != null)
        i = j + e.a.a.b.b.a.f(6, this.vYJ);
      paramInt = i;
      if (this.vYK != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.vYK);
      i = paramInt;
      if (this.vYL != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.vYL);
      paramInt = i;
      if (this.fKh != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.fKh);
      i = paramInt + e.a.a.b.b.a.bs(10, this.Scene);
      paramInt = i;
      if (this.vYM != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.vYM);
      AppMethodBeat.o(105144);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(105144);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        rl localrl = (rl)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(105144);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localrl.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(105144);
          paramInt = i;
          break;
        case 2:
          localrl.fJU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(105144);
          paramInt = i;
          break;
        case 3:
          localrl.Title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(105144);
          paramInt = i;
          break;
        case 4:
          localrl.vYH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(105144);
          paramInt = i;
          break;
        case 5:
          localrl.vYI = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(105144);
          paramInt = i;
          break;
        case 6:
          localrl.vYJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(105144);
          paramInt = i;
          break;
        case 7:
          localrl.vYK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(105144);
          paramInt = i;
          break;
        case 8:
          localrl.vYL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(105144);
          paramInt = i;
          break;
        case 9:
          localrl.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(105144);
          paramInt = i;
          break;
        case 10:
          localrl.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(105144);
          paramInt = i;
          break;
        case 11:
          localrl.vYM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(105144);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(105144);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.rl
 * JD-Core Version:    0.6.2
 */