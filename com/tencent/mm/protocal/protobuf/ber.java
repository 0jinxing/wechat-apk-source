package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ber extends bsr
{
  public int scene;
  public String vNN;
  public String wIH;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(10223);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wIH != null)
        paramArrayOfObject.e(2, this.wIH);
      if (this.vNN != null)
        paramArrayOfObject.e(3, this.vNN);
      paramArrayOfObject.iz(4, this.scene);
      AppMethodBeat.o(10223);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label507;
    label507: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wIH != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wIH);
      i = paramInt;
      if (this.vNN != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vNN);
      paramInt = i + e.a.a.b.b.a.bs(4, this.scene);
      AppMethodBeat.o(10223);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(10223);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ber localber = (ber)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10223);
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
            localber.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(10223);
          paramInt = i;
          break;
        case 2:
          localber.wIH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10223);
          paramInt = i;
          break;
        case 3:
          localber.vNN = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10223);
          paramInt = i;
          break;
        case 4:
          localber.scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(10223);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(10223);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ber
 * JD-Core Version:    0.6.2
 */