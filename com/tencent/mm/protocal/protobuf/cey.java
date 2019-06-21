package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cey extends com.tencent.mm.bt.a
{
  public String ThumbUrl;
  public int jCt;
  public String ncM;
  public String ndF;
  public String ndG;
  public int pcX;
  public long vQE;
  public int wZF;
  public int wZG;
  public int wZH;
  public int xdB;
  public cer xdJ;
  public String xdy;
  public String xdz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56544);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.ai(1, this.vQE);
      if (this.ndG != null)
        paramArrayOfObject.e(2, this.ndG);
      if (this.ndF != null)
        paramArrayOfObject.e(3, this.ndF);
      if (this.xdy != null)
        paramArrayOfObject.e(4, this.xdy);
      if (this.xdz != null)
        paramArrayOfObject.e(5, this.xdz);
      if (this.ncM != null)
        paramArrayOfObject.e(6, this.ncM);
      paramArrayOfObject.iz(7, this.jCt);
      paramArrayOfObject.iz(8, this.pcX);
      paramArrayOfObject.iz(9, this.wZG);
      paramArrayOfObject.iz(10, this.wZF);
      paramArrayOfObject.iz(11, this.wZH);
      if (this.ThumbUrl != null)
        paramArrayOfObject.e(12, this.ThumbUrl);
      if (this.xdJ != null)
      {
        paramArrayOfObject.iy(13, this.xdJ.computeSize());
        this.xdJ.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(14, this.xdB);
      AppMethodBeat.o(56544);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.o(1, this.vQE) + 0;
        i = paramInt;
        if (this.ndG != null)
          i = paramInt + e.a.a.b.b.a.f(2, this.ndG);
        paramInt = i;
        if (this.ndF != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.ndF);
        i = paramInt;
        if (this.xdy != null)
          i = paramInt + e.a.a.b.b.a.f(4, this.xdy);
        paramInt = i;
        if (this.xdz != null)
          paramInt = i + e.a.a.b.b.a.f(5, this.xdz);
        i = paramInt;
        if (this.ncM != null)
          i = paramInt + e.a.a.b.b.a.f(6, this.ncM);
        i = i + e.a.a.b.b.a.bs(7, this.jCt) + e.a.a.b.b.a.bs(8, this.pcX) + e.a.a.b.b.a.bs(9, this.wZG) + e.a.a.b.b.a.bs(10, this.wZF) + e.a.a.b.b.a.bs(11, this.wZH);
        paramInt = i;
        if (this.ThumbUrl != null)
          paramInt = i + e.a.a.b.b.a.f(12, this.ThumbUrl);
        i = paramInt;
        if (this.xdJ != null)
          i = paramInt + e.a.a.a.ix(13, this.xdJ.computeSize());
        paramInt = i + e.a.a.b.b.a.bs(14, this.xdB);
        AppMethodBeat.o(56544);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56544);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cey localcey = (cey)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56544);
          break;
        case 1:
          localcey.vQE = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56544);
          paramInt = 0;
          break;
        case 2:
          localcey.ndG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56544);
          paramInt = 0;
          break;
        case 3:
          localcey.ndF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56544);
          paramInt = 0;
          break;
        case 4:
          localcey.xdy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56544);
          paramInt = 0;
          break;
        case 5:
          localcey.xdz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56544);
          paramInt = 0;
          break;
        case 6:
          localcey.ncM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56544);
          paramInt = 0;
          break;
        case 7:
          localcey.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56544);
          paramInt = 0;
          break;
        case 8:
          localcey.pcX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56544);
          paramInt = 0;
          break;
        case 9:
          localcey.wZG = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56544);
          paramInt = 0;
          break;
        case 10:
          localcey.wZF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56544);
          paramInt = 0;
          break;
        case 11:
          localcey.wZH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56544);
          paramInt = 0;
          break;
        case 12:
          localcey.ThumbUrl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56544);
          paramInt = 0;
          break;
        case 13:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cer();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcey.xdJ = paramArrayOfObject;
          }
          AppMethodBeat.o(56544);
          paramInt = 0;
          break;
        case 14:
          localcey.xdB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56544);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56544);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cey
 * JD-Core Version:    0.6.2
 */