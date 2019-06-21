package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cee extends com.tencent.mm.bt.a
{
  public boolean aIM;
  public int eTb;
  public String eYi;
  public long endTime;
  public boolean fbV;
  public String musicUrl;
  public int rTW;
  public boolean rTZ;
  public cei smk;
  public long startTime;
  public String thumbPath;
  public long timeStamp;
  public String videoPath;
  public String xdR;
  public int xdS;
  public int xdT;
  public int xdU;
  public int xdV;
  public LinkedList<hk> xdW;
  public int xdX;
  public ced xdY;
  public int xdZ;
  public long xea;

  public cee()
  {
    AppMethodBeat.i(56513);
    this.xdW = new LinkedList();
    AppMethodBeat.o(56513);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56514);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.videoPath == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: videoPath");
        AppMethodBeat.o(56514);
        throw paramArrayOfObject;
      }
      if (this.thumbPath == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: thumbPath");
        AppMethodBeat.o(56514);
        throw paramArrayOfObject;
      }
      if (this.videoPath != null)
        paramArrayOfObject.e(1, this.videoPath);
      paramArrayOfObject.ai(2, this.startTime);
      paramArrayOfObject.ai(3, this.endTime);
      if (this.xdR != null)
        paramArrayOfObject.e(4, this.xdR);
      paramArrayOfObject.iz(5, this.eTb);
      if (this.thumbPath != null)
        paramArrayOfObject.e(6, this.thumbPath);
      if (this.eYi != null)
        paramArrayOfObject.e(7, this.eYi);
      paramArrayOfObject.iz(8, this.rTW);
      if (this.musicUrl != null)
        paramArrayOfObject.e(9, this.musicUrl);
      paramArrayOfObject.aO(10, this.aIM);
      paramArrayOfObject.aO(11, this.rTZ);
      paramArrayOfObject.iz(12, this.xdS);
      paramArrayOfObject.iz(13, this.xdT);
      paramArrayOfObject.iz(14, this.xdU);
      paramArrayOfObject.iz(15, this.xdV);
      paramArrayOfObject.e(16, 8, this.xdW);
      paramArrayOfObject.ai(17, this.timeStamp);
      paramArrayOfObject.iz(18, this.xdX);
      paramArrayOfObject.aO(19, this.fbV);
      if (this.smk != null)
      {
        paramArrayOfObject.iy(20, this.smk.computeSize());
        this.smk.writeFields(paramArrayOfObject);
      }
      if (this.xdY != null)
      {
        paramArrayOfObject.iy(21, this.xdY.computeSize());
        this.xdY.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(22, this.xdZ);
      paramArrayOfObject.ai(23, this.xea);
      AppMethodBeat.o(56514);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.videoPath == null)
        break label1751;
    label1751: for (paramInt = e.a.a.b.b.a.f(1, this.videoPath) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.o(2, this.startTime) + e.a.a.b.b.a.o(3, this.endTime);
      paramInt = i;
      if (this.xdR != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.xdR);
      i = paramInt + e.a.a.b.b.a.bs(5, this.eTb);
      paramInt = i;
      if (this.thumbPath != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.thumbPath);
      i = paramInt;
      if (this.eYi != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.eYi);
      i += e.a.a.b.b.a.bs(8, this.rTW);
      paramInt = i;
      if (this.musicUrl != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.musicUrl);
      i = paramInt + (e.a.a.b.b.a.fv(10) + 1) + (e.a.a.b.b.a.fv(11) + 1) + e.a.a.b.b.a.bs(12, this.xdS) + e.a.a.b.b.a.bs(13, this.xdT) + e.a.a.b.b.a.bs(14, this.xdU) + e.a.a.b.b.a.bs(15, this.xdV) + e.a.a.a.c(16, 8, this.xdW) + e.a.a.b.b.a.o(17, this.timeStamp) + e.a.a.b.b.a.bs(18, this.xdX) + (e.a.a.b.b.a.fv(19) + 1);
      paramInt = i;
      if (this.smk != null)
        paramInt = i + e.a.a.a.ix(20, this.smk.computeSize());
      i = paramInt;
      if (this.xdY != null)
        i = paramInt + e.a.a.a.ix(21, this.xdY.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(22, this.xdZ) + e.a.a.b.b.a.o(23, this.xea);
      AppMethodBeat.o(56514);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xdW.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.videoPath == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: videoPath");
          AppMethodBeat.o(56514);
          throw paramArrayOfObject;
        }
        if (this.thumbPath == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: thumbPath");
          AppMethodBeat.o(56514);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56514);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cee localcee = (cee)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56514);
          break;
        case 1:
          localcee.videoPath = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56514);
          paramInt = i;
          break;
        case 2:
          localcee.startTime = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56514);
          paramInt = i;
          break;
        case 3:
          localcee.endTime = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56514);
          paramInt = i;
          break;
        case 4:
          localcee.xdR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56514);
          paramInt = i;
          break;
        case 5:
          localcee.eTb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56514);
          paramInt = i;
          break;
        case 6:
          localcee.thumbPath = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56514);
          paramInt = i;
          break;
        case 7:
          localcee.eYi = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56514);
          paramInt = i;
          break;
        case 8:
          localcee.rTW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56514);
          paramInt = i;
          break;
        case 9:
          localcee.musicUrl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56514);
          paramInt = i;
          break;
        case 10:
          localcee.aIM = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(56514);
          paramInt = i;
          break;
        case 11:
          localcee.rTZ = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(56514);
          paramInt = i;
          break;
        case 12:
          localcee.xdS = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56514);
          paramInt = i;
          break;
        case 13:
          localcee.xdT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56514);
          paramInt = i;
          break;
        case 14:
          localcee.xdU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56514);
          paramInt = i;
          break;
        case 15:
          localcee.xdV = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56514);
          paramInt = i;
          break;
        case 16:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hk();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((hk)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcee.xdW.add(localObject1);
          }
          AppMethodBeat.o(56514);
          paramInt = i;
          break;
        case 17:
          localcee.timeStamp = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56514);
          paramInt = i;
          break;
        case 18:
          localcee.xdX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56514);
          paramInt = i;
          break;
        case 19:
          localcee.fbV = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(56514);
          paramInt = i;
          break;
        case 20:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cei();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cei)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcee.smk = ((cei)localObject1);
          }
          AppMethodBeat.o(56514);
          paramInt = i;
          break;
        case 21:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ced();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcee.xdY = paramArrayOfObject;
          }
          AppMethodBeat.o(56514);
          paramInt = i;
          break;
        case 22:
          localcee.xdZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56514);
          paramInt = i;
          break;
        case 23:
          localcee.xea = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56514);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56514);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cee
 * JD-Core Version:    0.6.2
 */