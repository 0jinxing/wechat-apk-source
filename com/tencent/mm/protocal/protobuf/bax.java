package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bax extends com.tencent.mm.bt.a
{
  public String Desc;
  public int aPA;
  public String csB;
  public String cvZ;
  public int cyN;
  public int eRu;
  public String token;
  public String videoPath;
  public int wEJ;
  public bar wFA;
  public int wFB;
  public LinkedList<bar> wFC;
  public int wFD;
  public String wFE;
  public String wFF;
  public String wFG;
  public baa wFH;
  public int wFI;
  public String wFc;
  public int wFd;
  public int wFe;
  public int wFm;
  public String wFn;

  public bax()
  {
    AppMethodBeat.i(94543);
    this.wFC = new LinkedList();
    AppMethodBeat.o(94543);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94544);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wFd);
      paramArrayOfObject.iz(2, this.wFe);
      paramArrayOfObject.iz(3, this.wEJ);
      if (this.wFA != null)
      {
        paramArrayOfObject.iy(4, this.wFA.computeSize());
        this.wFA.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(5, this.wFB);
      paramArrayOfObject.e(6, 8, this.wFC);
      paramArrayOfObject.iz(7, this.eRu);
      paramArrayOfObject.iz(8, this.wFD);
      if (this.Desc != null)
        paramArrayOfObject.e(9, this.Desc);
      if (this.wFE != null)
        paramArrayOfObject.e(10, this.wFE);
      if (this.token != null)
        paramArrayOfObject.e(11, this.token);
      if (this.wFn != null)
        paramArrayOfObject.e(12, this.wFn);
      paramArrayOfObject.iz(13, this.wFm);
      if (this.videoPath != null)
        paramArrayOfObject.e(14, this.videoPath);
      if (this.wFF != null)
        paramArrayOfObject.e(15, this.wFF);
      if (this.wFG != null)
        paramArrayOfObject.e(16, this.wFG);
      if (this.cvZ != null)
        paramArrayOfObject.e(17, this.cvZ);
      if (this.csB != null)
        paramArrayOfObject.e(18, this.csB);
      paramArrayOfObject.iz(19, this.aPA);
      paramArrayOfObject.iz(20, this.cyN);
      if (this.wFc != null)
        paramArrayOfObject.e(21, this.wFc);
      if (this.wFH != null)
      {
        paramArrayOfObject.iy(22, this.wFH.computeSize());
        this.wFH.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(23, this.wFI);
      AppMethodBeat.o(94544);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.wFd) + 0 + e.a.a.b.b.a.bs(2, this.wFe) + e.a.a.b.b.a.bs(3, this.wEJ);
        paramInt = i;
        if (this.wFA != null)
          paramInt = i + e.a.a.a.ix(4, this.wFA.computeSize());
        i = paramInt + e.a.a.b.b.a.bs(5, this.wFB) + e.a.a.a.c(6, 8, this.wFC) + e.a.a.b.b.a.bs(7, this.eRu) + e.a.a.b.b.a.bs(8, this.wFD);
        paramInt = i;
        if (this.Desc != null)
          paramInt = i + e.a.a.b.b.a.f(9, this.Desc);
        i = paramInt;
        if (this.wFE != null)
          i = paramInt + e.a.a.b.b.a.f(10, this.wFE);
        paramInt = i;
        if (this.token != null)
          paramInt = i + e.a.a.b.b.a.f(11, this.token);
        i = paramInt;
        if (this.wFn != null)
          i = paramInt + e.a.a.b.b.a.f(12, this.wFn);
        i += e.a.a.b.b.a.bs(13, this.wFm);
        paramInt = i;
        if (this.videoPath != null)
          paramInt = i + e.a.a.b.b.a.f(14, this.videoPath);
        i = paramInt;
        if (this.wFF != null)
          i = paramInt + e.a.a.b.b.a.f(15, this.wFF);
        paramInt = i;
        if (this.wFG != null)
          paramInt = i + e.a.a.b.b.a.f(16, this.wFG);
        i = paramInt;
        if (this.cvZ != null)
          i = paramInt + e.a.a.b.b.a.f(17, this.cvZ);
        paramInt = i;
        if (this.csB != null)
          paramInt = i + e.a.a.b.b.a.f(18, this.csB);
        i = paramInt + e.a.a.b.b.a.bs(19, this.aPA) + e.a.a.b.b.a.bs(20, this.cyN);
        paramInt = i;
        if (this.wFc != null)
          paramInt = i + e.a.a.b.b.a.f(21, this.wFc);
        i = paramInt;
        if (this.wFH != null)
          i = paramInt + e.a.a.a.ix(22, this.wFH.computeSize());
        paramInt = i + e.a.a.b.b.a.bs(23, this.wFI);
        AppMethodBeat.o(94544);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wFC.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94544);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bax localbax = (bax)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94544);
          break;
        case 1:
          localbax.wFd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94544);
          paramInt = 0;
          break;
        case 2:
          localbax.wFe = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94544);
          paramInt = 0;
          break;
        case 3:
          localbax.wEJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94544);
          paramInt = 0;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bar();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bar)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbax.wFA = ((bar)localObject1);
          }
          AppMethodBeat.o(94544);
          paramInt = 0;
          break;
        case 5:
          localbax.wFB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94544);
          paramInt = 0;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bar();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbax.wFC.add(paramArrayOfObject);
          }
          AppMethodBeat.o(94544);
          paramInt = 0;
          break;
        case 7:
          localbax.eRu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94544);
          paramInt = 0;
          break;
        case 8:
          localbax.wFD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94544);
          paramInt = 0;
          break;
        case 9:
          localbax.Desc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94544);
          paramInt = 0;
          break;
        case 10:
          localbax.wFE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94544);
          paramInt = 0;
          break;
        case 11:
          localbax.token = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94544);
          paramInt = 0;
          break;
        case 12:
          localbax.wFn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94544);
          paramInt = 0;
          break;
        case 13:
          localbax.wFm = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94544);
          paramInt = 0;
          break;
        case 14:
          localbax.videoPath = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94544);
          paramInt = 0;
          break;
        case 15:
          localbax.wFF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94544);
          paramInt = 0;
          break;
        case 16:
          localbax.wFG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94544);
          paramInt = 0;
          break;
        case 17:
          localbax.cvZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94544);
          paramInt = 0;
          break;
        case 18:
          localbax.csB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94544);
          paramInt = 0;
          break;
        case 19:
          localbax.aPA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94544);
          paramInt = 0;
          break;
        case 20:
          localbax.cyN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94544);
          paramInt = 0;
          break;
        case 21:
          localbax.wFc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94544);
          paramInt = 0;
          break;
        case 22:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new baa();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbax.wFH = paramArrayOfObject;
          }
          AppMethodBeat.o(94544);
          paramInt = 0;
          break;
        case 23:
          localbax.wFI = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94544);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(94544);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bax
 * JD-Core Version:    0.6.2
 */