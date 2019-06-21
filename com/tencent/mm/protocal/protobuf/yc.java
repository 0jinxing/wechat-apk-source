package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class yc extends com.tencent.mm.bt.a
{
  public int jCt;
  public String ndF;
  public int ptw;
  public int ptx;
  public String vEG;
  public String wdO;
  public SKBuiltinBuffer_t wdP;
  public String wdQ;
  public String wdR;
  public String wdS;
  public int wdT;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(53871);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wdP == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: EmojiBuffer");
        AppMethodBeat.o(53871);
        throw paramArrayOfObject;
      }
      if (this.wdO != null)
        paramArrayOfObject.e(1, this.wdO);
      paramArrayOfObject.iz(2, this.ptx);
      paramArrayOfObject.iz(3, this.ptw);
      if (this.wdP != null)
      {
        paramArrayOfObject.iy(4, this.wdP.computeSize());
        this.wdP.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(5, this.jCt);
      if (this.ndF != null)
        paramArrayOfObject.e(6, this.ndF);
      if (this.wdQ != null)
        paramArrayOfObject.e(7, this.wdQ);
      if (this.wdR != null)
        paramArrayOfObject.e(8, this.wdR);
      if (this.wdS != null)
        paramArrayOfObject.e(9, this.wdS);
      if (this.vEG != null)
        paramArrayOfObject.e(10, this.vEG);
      paramArrayOfObject.iz(11, this.wdT);
      AppMethodBeat.o(53871);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wdO == null)
        break label950;
    label950: for (paramInt = e.a.a.b.b.a.f(1, this.wdO) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.ptx) + e.a.a.b.b.a.bs(3, this.ptw);
      paramInt = i;
      if (this.wdP != null)
        paramInt = i + e.a.a.a.ix(4, this.wdP.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(5, this.jCt);
      paramInt = i;
      if (this.ndF != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.ndF);
      i = paramInt;
      if (this.wdQ != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.wdQ);
      paramInt = i;
      if (this.wdR != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.wdR);
      i = paramInt;
      if (this.wdS != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.wdS);
      paramInt = i;
      if (this.vEG != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.vEG);
      paramInt += e.a.a.b.b.a.bs(11, this.wdT);
      AppMethodBeat.o(53871);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wdP == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: EmojiBuffer");
          AppMethodBeat.o(53871);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(53871);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        yc localyc = (yc)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(53871);
          break;
        case 1:
          localyc.wdO = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(53871);
          paramInt = i;
          break;
        case 2:
          localyc.ptx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(53871);
          paramInt = i;
          break;
        case 3:
          localyc.ptw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(53871);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localyc.wdP = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(53871);
          paramInt = i;
          break;
        case 5:
          localyc.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(53871);
          paramInt = i;
          break;
        case 6:
          localyc.ndF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(53871);
          paramInt = i;
          break;
        case 7:
          localyc.wdQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(53871);
          paramInt = i;
          break;
        case 8:
          localyc.wdR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(53871);
          paramInt = i;
          break;
        case 9:
          localyc.wdS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(53871);
          paramInt = i;
          break;
        case 10:
          localyc.vEG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(53871);
          paramInt = i;
          break;
        case 11:
          localyc.wdT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(53871);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(53871);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.yc
 * JD-Core Version:    0.6.2
 */