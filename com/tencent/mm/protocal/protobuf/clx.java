package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class clx extends bsr
{
  public int fJT;
  public String ndF;
  public String ndG;
  public int ptD;
  public long ptF;
  public SKBuiltinBuffer_t ptz;
  public String vEG;
  public String vFF;
  public int vOq;
  public int wEz;
  public int wdW;
  public int wdn;
  public int wdp;
  public int wdq;
  public int xjF;
  public int xjG;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(116811);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ptz == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Data");
        AppMethodBeat.o(116811);
        throw paramArrayOfObject;
      }
      if (this.ndG != null)
        paramArrayOfObject.e(1, this.ndG);
      if (this.ndF != null)
        paramArrayOfObject.e(2, this.ndF);
      paramArrayOfObject.iz(3, this.vOq);
      paramArrayOfObject.iz(4, this.wdn);
      if (this.vFF != null)
        paramArrayOfObject.e(5, this.vFF);
      paramArrayOfObject.iz(6, this.ptD);
      paramArrayOfObject.iz(7, this.wdp);
      if (this.ptz != null)
      {
        paramArrayOfObject.iy(8, this.ptz.computeSize());
        this.ptz.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(9, this.fJT);
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(10, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(11, this.wdq);
      if (this.vEG != null)
        paramArrayOfObject.e(12, this.vEG);
      paramArrayOfObject.iz(13, this.wEz);
      paramArrayOfObject.iz(14, this.xjF);
      paramArrayOfObject.iz(15, this.xjG);
      paramArrayOfObject.ai(16, this.ptF);
      paramArrayOfObject.iz(17, this.wdW);
      AppMethodBeat.o(116811);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.ndG == null)
        break label1313;
    label1313: for (paramInt = e.a.a.b.b.a.f(1, this.ndG) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.ndF != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.ndF);
      i = i + e.a.a.b.b.a.bs(3, this.vOq) + e.a.a.b.b.a.bs(4, this.wdn);
      paramInt = i;
      if (this.vFF != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vFF);
      i = paramInt + e.a.a.b.b.a.bs(6, this.ptD) + e.a.a.b.b.a.bs(7, this.wdp);
      paramInt = i;
      if (this.ptz != null)
        paramInt = i + e.a.a.a.ix(8, this.ptz.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(9, this.fJT);
      paramInt = i;
      if (this.BaseRequest != null)
        paramInt = i + e.a.a.a.ix(10, this.BaseRequest.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(11, this.wdq);
      paramInt = i;
      if (this.vEG != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.vEG);
      paramInt = paramInt + e.a.a.b.b.a.bs(13, this.wEz) + e.a.a.b.b.a.bs(14, this.xjF) + e.a.a.b.b.a.bs(15, this.xjG) + e.a.a.b.b.a.o(16, this.ptF) + e.a.a.b.b.a.bs(17, this.wdW);
      AppMethodBeat.o(116811);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.ptz == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Data");
          AppMethodBeat.o(116811);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(116811);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        clx localclx = (clx)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(116811);
          break;
        case 1:
          localclx.ndG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(116811);
          paramInt = i;
          break;
        case 2:
          localclx.ndF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(116811);
          paramInt = i;
          break;
        case 3:
          localclx.vOq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116811);
          paramInt = i;
          break;
        case 4:
          localclx.wdn = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116811);
          paramInt = i;
          break;
        case 5:
          localclx.vFF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(116811);
          paramInt = i;
          break;
        case 6:
          localclx.ptD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116811);
          paramInt = i;
          break;
        case 7:
          localclx.wdp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116811);
          paramInt = i;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localclx.ptz = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(116811);
          paramInt = i;
          break;
        case 9:
          localclx.fJT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116811);
          paramInt = i;
          break;
        case 10:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localclx.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(116811);
          paramInt = i;
          break;
        case 11:
          localclx.wdq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116811);
          paramInt = i;
          break;
        case 12:
          localclx.vEG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(116811);
          paramInt = i;
          break;
        case 13:
          localclx.wEz = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116811);
          paramInt = i;
          break;
        case 14:
          localclx.xjF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116811);
          paramInt = i;
          break;
        case 15:
          localclx.xjG = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116811);
          paramInt = i;
          break;
        case 16:
          localclx.ptF = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(116811);
          paramInt = i;
          break;
        case 17:
          localclx.wdW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116811);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(116811);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.clx
 * JD-Core Version:    0.6.2
 */