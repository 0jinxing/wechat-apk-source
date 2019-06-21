package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class bzg extends bsr
{
  public int Scene;
  public int jBv;
  public LinkedList<Integer> vKh;
  public String wYk;

  public bzg()
  {
    AppMethodBeat.i(51433);
    this.vKh = new LinkedList();
    AppMethodBeat.o(51433);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(51434);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wYk != null)
        paramArrayOfObject.e(2, this.wYk);
      paramArrayOfObject.iz(3, this.Scene);
      paramArrayOfObject.iz(4, this.jBv);
      paramArrayOfObject.f(5, 2, this.vKh);
      AppMethodBeat.o(51434);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label554;
    label554: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wYk != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wYk);
      paramInt = i + e.a.a.b.b.a.bs(3, this.Scene) + e.a.a.b.b.a.bs(4, this.jBv) + e.a.a.a.d(5, 2, this.vKh);
      AppMethodBeat.o(51434);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vKh.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(51434);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bzg localbzg = (bzg)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51434);
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
            localbzg.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(51434);
          paramInt = i;
          break;
        case 2:
          localbzg.wYk = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51434);
          paramInt = i;
          break;
        case 3:
          localbzg.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51434);
          paramInt = i;
          break;
        case 4:
          localbzg.jBv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51434);
          paramInt = i;
          break;
        case 5:
          localbzg.vKh = new e.a.a.a.a(((e.a.a.a.a)localObject1).BTU.emu().wR, unknownTagHandler).BTU.emt();
          AppMethodBeat.o(51434);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(51434);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bzg
 * JD-Core Version:    0.6.2
 */