package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class abl extends com.tencent.mm.bt.a
{
  public String appId;
  public String cEV;
  public String cJb;
  public String cOS;
  public long createTime;
  public String csl;
  public int cvp;
  public boolean fDT = false;
  public String link;
  public String toUser;
  public boolean whP = false;
  public boolean whQ = false;
  public boolean whR = false;
  public String whU;
  public boolean whV = false;
  public boolean whW = false;
  public boolean whX = false;
  public boolean whY = false;
  public boolean whZ = false;
  public String wiC;
  public boolean wiD = false;
  public String wia;
  public boolean wib = false;
  public boolean wic = false;

  public final abl LN(int paramInt)
  {
    this.cvp = paramInt;
    this.whP = true;
    return this;
  }

  public final abl alD(String paramString)
  {
    this.cEV = paramString;
    this.whQ = true;
    return this;
  }

  public final abl alE(String paramString)
  {
    this.toUser = paramString;
    this.whR = true;
    return this;
  }

  public final abl alF(String paramString)
  {
    this.wiC = paramString;
    this.wiD = true;
    return this;
  }

  public final abl alG(String paramString)
  {
    this.whU = paramString;
    this.whV = true;
    return this;
  }

  public final abl alH(String paramString)
  {
    this.cJb = paramString;
    this.whW = true;
    return this;
  }

  public final abl alI(String paramString)
  {
    this.cOS = paramString;
    this.whX = true;
    return this;
  }

  public final abl alJ(String paramString)
  {
    this.appId = paramString;
    this.whY = true;
    return this;
  }

  public final abl alK(String paramString)
  {
    this.link = paramString;
    this.whZ = true;
    return this;
  }

  public final abl alL(String paramString)
  {
    this.csl = paramString;
    this.wic = true;
    return this;
  }

  public final abl ml(long paramLong)
  {
    this.createTime = paramLong;
    this.fDT = true;
    return this;
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(51412);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (!this.whP)
      {
        paramArrayOfObject = new b("Not all required fields were included: sourceType");
        AppMethodBeat.o(51412);
        throw paramArrayOfObject;
      }
      if (this.whP == true)
        paramArrayOfObject.iz(1, this.cvp);
      if (this.cEV != null)
        paramArrayOfObject.e(2, this.cEV);
      if (this.toUser != null)
        paramArrayOfObject.e(3, this.toUser);
      if (this.wiC != null)
        paramArrayOfObject.e(4, this.wiC);
      if (this.whU != null)
        paramArrayOfObject.e(5, this.whU);
      if (this.fDT == true)
        paramArrayOfObject.ai(6, this.createTime);
      if (this.cJb != null)
        paramArrayOfObject.e(7, this.cJb);
      if (this.cOS != null)
        paramArrayOfObject.e(8, this.cOS);
      if (this.appId != null)
        paramArrayOfObject.e(9, this.appId);
      if (this.link != null)
        paramArrayOfObject.e(10, this.link);
      if (this.wia != null)
        paramArrayOfObject.e(11, this.wia);
      if (this.csl != null)
        paramArrayOfObject.e(12, this.csl);
      AppMethodBeat.o(51412);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.whP != true)
        break label1060;
    label1060: for (paramInt = e.a.a.b.b.a.bs(1, this.cvp) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.cEV != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.cEV);
      paramInt = i;
      if (this.toUser != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.toUser);
      i = paramInt;
      if (this.wiC != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wiC);
      paramInt = i;
      if (this.whU != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.whU);
      i = paramInt;
      if (this.fDT == true)
        i = paramInt + e.a.a.b.b.a.o(6, this.createTime);
      paramInt = i;
      if (this.cJb != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.cJb);
      i = paramInt;
      if (this.cOS != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.cOS);
      paramInt = i;
      if (this.appId != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.appId);
      i = paramInt;
      if (this.link != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.link);
      paramInt = i;
      if (this.wia != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.wia);
      i = paramInt;
      if (this.csl != null)
        i = paramInt + e.a.a.b.b.a.f(12, this.csl);
      AppMethodBeat.o(51412);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (!this.whP)
        {
          paramArrayOfObject = new b("Not all required fields were included: sourceType");
          AppMethodBeat.o(51412);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(51412);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        abl localabl = (abl)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51412);
          break;
        case 1:
          localabl.cvp = locala.BTU.vd();
          localabl.whP = true;
          AppMethodBeat.o(51412);
          paramInt = i;
          break;
        case 2:
          localabl.cEV = locala.BTU.readString();
          localabl.whQ = true;
          AppMethodBeat.o(51412);
          paramInt = i;
          break;
        case 3:
          localabl.toUser = locala.BTU.readString();
          localabl.whR = true;
          AppMethodBeat.o(51412);
          paramInt = i;
          break;
        case 4:
          localabl.wiC = locala.BTU.readString();
          localabl.wiD = true;
          AppMethodBeat.o(51412);
          paramInt = i;
          break;
        case 5:
          localabl.whU = locala.BTU.readString();
          localabl.whV = true;
          AppMethodBeat.o(51412);
          paramInt = i;
          break;
        case 6:
          localabl.createTime = locala.BTU.ve();
          localabl.fDT = true;
          AppMethodBeat.o(51412);
          paramInt = i;
          break;
        case 7:
          localabl.cJb = locala.BTU.readString();
          localabl.whW = true;
          AppMethodBeat.o(51412);
          paramInt = i;
          break;
        case 8:
          localabl.cOS = locala.BTU.readString();
          localabl.whX = true;
          AppMethodBeat.o(51412);
          paramInt = i;
          break;
        case 9:
          localabl.appId = locala.BTU.readString();
          localabl.whY = true;
          AppMethodBeat.o(51412);
          paramInt = i;
          break;
        case 10:
          localabl.link = locala.BTU.readString();
          localabl.whZ = true;
          AppMethodBeat.o(51412);
          paramInt = i;
          break;
        case 11:
          localabl.wia = locala.BTU.readString();
          localabl.wib = true;
          AppMethodBeat.o(51412);
          paramInt = i;
          break;
        case 12:
          localabl.csl = locala.BTU.readString();
          localabl.wic = true;
          AppMethodBeat.o(51412);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(51412);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.abl
 * JD-Core Version:    0.6.2
 */