package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class dv extends com.tencent.mm.bt.a
{
  public String fKh;
  public int jCt;
  public String ncM;
  public String ndF;
  public String ndG;
  public int pcX;
  public String vEG;
  public int vFE;
  public String vFF;
  public SKBuiltinBuffer_t vFG;
  public int vFH;
  public int vFI;
  public String vFJ;
  public String vFK;
  public String vFL;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28312);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ndG != null)
        paramArrayOfObject.e(1, this.ndG);
      if (this.fKh != null)
        paramArrayOfObject.e(2, this.fKh);
      paramArrayOfObject.iz(3, this.vFE);
      if (this.ndF != null)
        paramArrayOfObject.e(4, this.ndF);
      paramArrayOfObject.iz(5, this.jCt);
      if (this.ncM != null)
        paramArrayOfObject.e(6, this.ncM);
      paramArrayOfObject.iz(7, this.pcX);
      if (this.vFF != null)
        paramArrayOfObject.e(8, this.vFF);
      if (this.vFG != null)
      {
        paramArrayOfObject.iy(9, this.vFG.computeSize());
        this.vFG.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(10, this.vFH);
      paramArrayOfObject.iz(11, this.vFI);
      if (this.vEG != null)
        paramArrayOfObject.e(12, this.vEG);
      if (this.vFJ != null)
        paramArrayOfObject.e(13, this.vFJ);
      if (this.vFK != null)
        paramArrayOfObject.e(14, this.vFK);
      if (this.vFL != null)
        paramArrayOfObject.e(15, this.vFL);
      AppMethodBeat.o(28312);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.ndG == null)
        break label1166;
    label1166: for (paramInt = e.a.a.b.b.a.f(1, this.ndG) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.fKh != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.fKh);
      i += e.a.a.b.b.a.bs(3, this.vFE);
      paramInt = i;
      if (this.ndF != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.ndF);
      i = paramInt + e.a.a.b.b.a.bs(5, this.jCt);
      paramInt = i;
      if (this.ncM != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.ncM);
      i = paramInt + e.a.a.b.b.a.bs(7, this.pcX);
      paramInt = i;
      if (this.vFF != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.vFF);
      i = paramInt;
      if (this.vFG != null)
        i = paramInt + e.a.a.a.ix(9, this.vFG.computeSize());
      i = i + e.a.a.b.b.a.bs(10, this.vFH) + e.a.a.b.b.a.bs(11, this.vFI);
      paramInt = i;
      if (this.vEG != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.vEG);
      i = paramInt;
      if (this.vFJ != null)
        i = paramInt + e.a.a.b.b.a.f(13, this.vFJ);
      paramInt = i;
      if (this.vFK != null)
        paramInt = i + e.a.a.b.b.a.f(14, this.vFK);
      i = paramInt;
      if (this.vFL != null)
        i = paramInt + e.a.a.b.b.a.f(15, this.vFL);
      AppMethodBeat.o(28312);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28312);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        dv localdv = (dv)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28312);
          break;
        case 1:
          localdv.ndG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28312);
          paramInt = i;
          break;
        case 2:
          localdv.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28312);
          paramInt = i;
          break;
        case 3:
          localdv.vFE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28312);
          paramInt = i;
          break;
        case 4:
          localdv.ndF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28312);
          paramInt = i;
          break;
        case 5:
          localdv.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28312);
          paramInt = i;
          break;
        case 6:
          localdv.ncM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28312);
          paramInt = i;
          break;
        case 7:
          localdv.pcX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28312);
          paramInt = i;
          break;
        case 8:
          localdv.vFF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28312);
          paramInt = i;
          break;
        case 9:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localdv.vFG = paramArrayOfObject;
          }
          AppMethodBeat.o(28312);
          paramInt = i;
          break;
        case 10:
          localdv.vFH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28312);
          paramInt = i;
          break;
        case 11:
          localdv.vFI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28312);
          paramInt = i;
          break;
        case 12:
          localdv.vEG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28312);
          paramInt = i;
          break;
        case 13:
          localdv.vFJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28312);
          paramInt = i;
          break;
        case 14:
          localdv.vFK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28312);
          paramInt = i;
          break;
        case 15:
          localdv.vFL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28312);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28312);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.dv
 * JD-Core Version:    0.6.2
 */