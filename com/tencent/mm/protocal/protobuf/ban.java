package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ban extends bsr
{
  public String cMC;
  public int scene;
  public int wEj;
  public int wEk;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89111);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.cMC != null)
        paramArrayOfObject.e(2, this.cMC);
      paramArrayOfObject.iz(3, this.wEj);
      paramArrayOfObject.iz(4, this.wEk);
      paramArrayOfObject.iz(5, this.scene);
      AppMethodBeat.o(89111);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label524;
    label524: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.cMC != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.cMC);
      paramInt = i + e.a.a.b.b.a.bs(3, this.wEj) + e.a.a.b.b.a.bs(4, this.wEk) + e.a.a.b.b.a.bs(5, this.scene);
      AppMethodBeat.o(89111);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89111);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ban localban = (ban)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89111);
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
            localban.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(89111);
          paramInt = i;
          break;
        case 2:
          localban.cMC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89111);
          paramInt = i;
          break;
        case 3:
          localban.wEj = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89111);
          paramInt = i;
          break;
        case 4:
          localban.wEk = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89111);
          paramInt = i;
          break;
        case 5:
          localban.scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89111);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89111);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ban
 * JD-Core Version:    0.6.2
 */