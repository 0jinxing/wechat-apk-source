package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class atj extends com.tencent.mm.bt.a
{
  public int kbK;
  public String kdf;
  public int state;
  public int tob;
  public int vNm;
  public String vYh;
  public long wch;
  public String wpp;
  public String wxs;
  public bkc wxt;
  public int wxu;
  public int wxv;
  public String wxw;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48871);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wpp != null)
        paramArrayOfObject.e(1, this.wpp);
      if (this.vYh != null)
        paramArrayOfObject.e(2, this.vYh);
      paramArrayOfObject.ai(3, this.wch);
      paramArrayOfObject.iz(4, this.state);
      if (this.wxs != null)
        paramArrayOfObject.e(5, this.wxs);
      paramArrayOfObject.iz(6, this.tob);
      if (this.wxt != null)
      {
        paramArrayOfObject.iy(7, this.wxt.computeSize());
        this.wxt.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(8, this.vNm);
      paramArrayOfObject.iz(9, this.kbK);
      paramArrayOfObject.iz(10, this.wxu);
      paramArrayOfObject.iz(11, this.wxv);
      if (this.wxw != null)
        paramArrayOfObject.e(12, this.wxw);
      if (this.kdf != null)
        paramArrayOfObject.e(13, this.kdf);
      AppMethodBeat.o(48871);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wpp == null)
        break label980;
    label980: for (paramInt = e.a.a.b.b.a.f(1, this.wpp) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vYh != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vYh);
      i = i + e.a.a.b.b.a.o(3, this.wch) + e.a.a.b.b.a.bs(4, this.state);
      paramInt = i;
      if (this.wxs != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wxs);
      i = paramInt + e.a.a.b.b.a.bs(6, this.tob);
      paramInt = i;
      if (this.wxt != null)
        paramInt = i + e.a.a.a.ix(7, this.wxt.computeSize());
      i = paramInt + e.a.a.b.b.a.bs(8, this.vNm) + e.a.a.b.b.a.bs(9, this.kbK) + e.a.a.b.b.a.bs(10, this.wxu) + e.a.a.b.b.a.bs(11, this.wxv);
      paramInt = i;
      if (this.wxw != null)
        paramInt = i + e.a.a.b.b.a.f(12, this.wxw);
      i = paramInt;
      if (this.kdf != null)
        i = paramInt + e.a.a.b.b.a.f(13, this.kdf);
      AppMethodBeat.o(48871);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48871);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        atj localatj = (atj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48871);
          break;
        case 1:
          localatj.wpp = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48871);
          paramInt = i;
          break;
        case 2:
          localatj.vYh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48871);
          paramInt = i;
          break;
        case 3:
          localatj.wch = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(48871);
          paramInt = i;
          break;
        case 4:
          localatj.state = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48871);
          paramInt = i;
          break;
        case 5:
          localatj.wxs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48871);
          paramInt = i;
          break;
        case 6:
          localatj.tob = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48871);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bkc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bkc)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localatj.wxt = ((bkc)localObject1);
          }
          AppMethodBeat.o(48871);
          paramInt = i;
          break;
        case 8:
          localatj.vNm = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48871);
          paramInt = i;
          break;
        case 9:
          localatj.kbK = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48871);
          paramInt = i;
          break;
        case 10:
          localatj.wxu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48871);
          paramInt = i;
          break;
        case 11:
          localatj.wxv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48871);
          paramInt = i;
          break;
        case 12:
          localatj.wxw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48871);
          paramInt = i;
          break;
        case 13:
          localatj.kdf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48871);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48871);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.atj
 * JD-Core Version:    0.6.2
 */