package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class ctv extends com.tencent.mm.bt.a
{
  public String dFt;
  public String jBG;
  public int vFE;
  public String wbq;
  public String xqs;
  public String xqt;
  public String xqu;
  public String xqv;
  public String xqw;
  public String xqx;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28732);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xqs == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: LocalNodeId");
        AppMethodBeat.o(28732);
        throw paramArrayOfObject;
      }
      if (this.xqs != null)
        paramArrayOfObject.e(1, this.xqs);
      if (this.jBG != null)
        paramArrayOfObject.e(2, this.jBG);
      if (this.xqt != null)
        paramArrayOfObject.e(3, this.xqt);
      if (this.dFt != null)
        paramArrayOfObject.e(4, this.dFt);
      if (this.xqu != null)
        paramArrayOfObject.e(5, this.xqu);
      if (this.wbq != null)
        paramArrayOfObject.e(6, this.wbq);
      if (this.xqv != null)
        paramArrayOfObject.e(7, this.xqv);
      if (this.xqw != null)
        paramArrayOfObject.e(8, this.xqw);
      if (this.xqx != null)
        paramArrayOfObject.e(9, this.xqx);
      paramArrayOfObject.iz(10, this.vFE);
      AppMethodBeat.o(28732);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.xqs == null)
        break label854;
    label854: for (i = e.a.a.b.b.a.f(1, this.xqs) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.jBG != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.jBG);
      i = paramInt;
      if (this.xqt != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.xqt);
      paramInt = i;
      if (this.dFt != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.dFt);
      i = paramInt;
      if (this.xqu != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.xqu);
      paramInt = i;
      if (this.wbq != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wbq);
      i = paramInt;
      if (this.xqv != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.xqv);
      paramInt = i;
      if (this.xqw != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.xqw);
      i = paramInt;
      if (this.xqx != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.xqx);
      paramInt = i + e.a.a.b.b.a.bs(10, this.vFE);
      AppMethodBeat.o(28732);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xqs == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: LocalNodeId");
          AppMethodBeat.o(28732);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28732);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ctv localctv = (ctv)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28732);
          break;
        case 1:
          localctv.xqs = locala.BTU.readString();
          AppMethodBeat.o(28732);
          paramInt = i;
          break;
        case 2:
          localctv.jBG = locala.BTU.readString();
          AppMethodBeat.o(28732);
          paramInt = i;
          break;
        case 3:
          localctv.xqt = locala.BTU.readString();
          AppMethodBeat.o(28732);
          paramInt = i;
          break;
        case 4:
          localctv.dFt = locala.BTU.readString();
          AppMethodBeat.o(28732);
          paramInt = i;
          break;
        case 5:
          localctv.xqu = locala.BTU.readString();
          AppMethodBeat.o(28732);
          paramInt = i;
          break;
        case 6:
          localctv.wbq = locala.BTU.readString();
          AppMethodBeat.o(28732);
          paramInt = i;
          break;
        case 7:
          localctv.xqv = locala.BTU.readString();
          AppMethodBeat.o(28732);
          paramInt = i;
          break;
        case 8:
          localctv.xqw = locala.BTU.readString();
          AppMethodBeat.o(28732);
          paramInt = i;
          break;
        case 9:
          localctv.xqx = locala.BTU.readString();
          AppMethodBeat.o(28732);
          paramInt = i;
          break;
        case 10:
          localctv.vFE = locala.BTU.vd();
          AppMethodBeat.o(28732);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28732);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ctv
 * JD-Core Version:    0.6.2
 */