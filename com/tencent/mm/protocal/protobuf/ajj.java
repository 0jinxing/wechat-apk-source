package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ajj extends bsr
{
  public String jBB;
  public int ptw;
  public int ptx;
  public int wpf;
  public int wpg;
  public String wph;
  public int wpi;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80073);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.jBB != null)
        paramArrayOfObject.e(2, this.jBB);
      paramArrayOfObject.iz(3, this.wpf);
      paramArrayOfObject.iz(4, this.wpg);
      if (this.wph != null)
        paramArrayOfObject.e(5, this.wph);
      paramArrayOfObject.iz(6, this.ptw);
      paramArrayOfObject.iz(7, this.ptx);
      paramArrayOfObject.iz(8, this.wpi);
      AppMethodBeat.o(80073);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label685;
    label685: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.jBB != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.jBB);
      i = i + e.a.a.b.b.a.bs(3, this.wpf) + e.a.a.b.b.a.bs(4, this.wpg);
      paramInt = i;
      if (this.wph != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wph);
      paramInt = paramInt + e.a.a.b.b.a.bs(6, this.ptw) + e.a.a.b.b.a.bs(7, this.ptx) + e.a.a.b.b.a.bs(8, this.wpi);
      AppMethodBeat.o(80073);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80073);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ajj localajj = (ajj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80073);
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
            localajj.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(80073);
          paramInt = i;
          break;
        case 2:
          localajj.jBB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80073);
          paramInt = i;
          break;
        case 3:
          localajj.wpf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80073);
          paramInt = i;
          break;
        case 4:
          localajj.wpg = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80073);
          paramInt = i;
          break;
        case 5:
          localajj.wph = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80073);
          paramInt = i;
          break;
        case 6:
          localajj.ptw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80073);
          paramInt = i;
          break;
        case 7:
          localajj.ptx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80073);
          paramInt = i;
          break;
        case 8:
          localajj.wpi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80073);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80073);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ajj
 * JD-Core Version:    0.6.2
 */