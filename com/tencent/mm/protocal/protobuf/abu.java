package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class abu extends com.tencent.mm.bt.a
{
  public String canvasPageXml;
  public String desc;
  public int fgt;
  public String thumbUrl;
  public String title;
  public boolean wfS = false;
  public boolean wfT = false;
  public boolean whe = false;
  public String wiY;
  public boolean wiZ = false;
  public boolean wiq = false;
  public int wja;
  public boolean wjb = false;
  public boolean wjc = false;

  public final abu LO(int paramInt)
  {
    this.wja = paramInt;
    this.wjb = true;
    return this;
  }

  public final abu LP(int paramInt)
  {
    this.fgt = paramInt;
    this.wjc = true;
    return this;
  }

  public final abu alQ(String paramString)
  {
    this.title = paramString;
    this.wfS = true;
    return this;
  }

  public final abu alR(String paramString)
  {
    this.desc = paramString;
    this.wfT = true;
    return this;
  }

  public final abu alS(String paramString)
  {
    this.wiY = paramString;
    this.wiZ = true;
    return this;
  }

  public final abu alT(String paramString)
  {
    this.thumbUrl = paramString;
    this.wiq = true;
    return this;
  }

  public final abu alU(String paramString)
  {
    this.canvasPageXml = paramString;
    this.whe = true;
    return this;
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(51424);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.title != null)
        paramArrayOfObject.e(1, this.title);
      if (this.desc != null)
        paramArrayOfObject.e(2, this.desc);
      if (this.wiY != null)
        paramArrayOfObject.e(3, this.wiY);
      if (this.thumbUrl != null)
        paramArrayOfObject.e(4, this.thumbUrl);
      if (this.wjb == true)
        paramArrayOfObject.iz(5, this.wja);
      if (this.wjc == true)
        paramArrayOfObject.iz(6, this.fgt);
      if (this.canvasPageXml != null)
        paramArrayOfObject.e(7, this.canvasPageXml);
      AppMethodBeat.o(51424);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.title == null)
        break label655;
    label655: for (paramInt = e.a.a.b.b.a.f(1, this.title) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.desc != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.desc);
      paramInt = i;
      if (this.wiY != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.wiY);
      i = paramInt;
      if (this.thumbUrl != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.thumbUrl);
      paramInt = i;
      if (this.wjb == true)
        paramInt = i + e.a.a.b.b.a.bs(5, this.wja);
      i = paramInt;
      if (this.wjc == true)
        i = paramInt + e.a.a.b.b.a.bs(6, this.fgt);
      paramInt = i;
      if (this.canvasPageXml != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.canvasPageXml);
      AppMethodBeat.o(51424);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(51424);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        abu localabu = (abu)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51424);
          break;
        case 1:
          localabu.title = locala.BTU.readString();
          localabu.wfS = true;
          AppMethodBeat.o(51424);
          paramInt = i;
          break;
        case 2:
          localabu.desc = locala.BTU.readString();
          localabu.wfT = true;
          AppMethodBeat.o(51424);
          paramInt = i;
          break;
        case 3:
          localabu.wiY = locala.BTU.readString();
          localabu.wiZ = true;
          AppMethodBeat.o(51424);
          paramInt = i;
          break;
        case 4:
          localabu.thumbUrl = locala.BTU.readString();
          localabu.wiq = true;
          AppMethodBeat.o(51424);
          paramInt = i;
          break;
        case 5:
          localabu.wja = locala.BTU.vd();
          localabu.wjb = true;
          AppMethodBeat.o(51424);
          paramInt = i;
          break;
        case 6:
          localabu.fgt = locala.BTU.vd();
          localabu.wjc = true;
          AppMethodBeat.o(51424);
          paramInt = i;
          break;
        case 7:
          localabu.canvasPageXml = locala.BTU.readString();
          localabu.whe = true;
          AppMethodBeat.o(51424);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(51424);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.abu
 * JD-Core Version:    0.6.2
 */