package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class chi extends com.tencent.mm.bt.a
{
  public String Md5;
  public int Version;
  public int jCt;
  public String vZm;
  public int vZn;
  public int wUX;
  public String wld;
  public LinkedList<chh> xgc;
  public boolean xgd;
  public LinkedList<chj> xge;
  public String xgf;

  public chi()
  {
    AppMethodBeat.i(14756);
    this.xgc = new LinkedList();
    this.xge = new LinkedList();
    AppMethodBeat.o(14756);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(14757);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.jCt);
      paramArrayOfObject.iz(2, this.Version);
      if (this.vZm != null)
        paramArrayOfObject.e(3, this.vZm);
      if (this.Md5 != null)
        paramArrayOfObject.e(4, this.Md5);
      paramArrayOfObject.iz(5, this.vZn);
      paramArrayOfObject.iz(6, this.wUX);
      paramArrayOfObject.e(7, 8, this.xgc);
      paramArrayOfObject.aO(8, this.xgd);
      if (this.wld != null)
        paramArrayOfObject.e(9, this.wld);
      paramArrayOfObject.e(10, 8, this.xge);
      if (this.xgf != null)
        paramArrayOfObject.e(11, this.xgf);
      AppMethodBeat.o(14757);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.jCt) + 0 + e.a.a.b.b.a.bs(2, this.Version);
        paramInt = i;
        if (this.vZm != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.vZm);
        i = paramInt;
        if (this.Md5 != null)
          i = paramInt + e.a.a.b.b.a.f(4, this.Md5);
        i = i + e.a.a.b.b.a.bs(5, this.vZn) + e.a.a.b.b.a.bs(6, this.wUX) + e.a.a.a.c(7, 8, this.xgc) + (e.a.a.b.b.a.fv(8) + 1);
        paramInt = i;
        if (this.wld != null)
          paramInt = i + e.a.a.b.b.a.f(9, this.wld);
        i = paramInt + e.a.a.a.c(10, 8, this.xge);
        paramInt = i;
        if (this.xgf != null)
          paramInt = i + e.a.a.b.b.a.f(11, this.xgf);
        AppMethodBeat.o(14757);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xgc.clear();
        this.xge.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(14757);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        chi localchi = (chi)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(14757);
          break;
        case 1:
          localchi.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14757);
          paramInt = 0;
          break;
        case 2:
          localchi.Version = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14757);
          paramInt = 0;
          break;
        case 3:
          localchi.vZm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14757);
          paramInt = 0;
          break;
        case 4:
          localchi.Md5 = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14757);
          paramInt = 0;
          break;
        case 5:
          localchi.vZn = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14757);
          paramInt = 0;
          break;
        case 6:
          localchi.wUX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(14757);
          paramInt = 0;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new chh();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((chh)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localchi.xgc.add(localObject1);
          }
          AppMethodBeat.o(14757);
          paramInt = 0;
          break;
        case 8:
          localchi.xgd = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(14757);
          paramInt = 0;
          break;
        case 9:
          localchi.wld = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14757);
          paramInt = 0;
          break;
        case 10:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new chj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((chj)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localchi.xge.add(localObject1);
          }
          AppMethodBeat.o(14757);
          paramInt = 0;
          break;
        case 11:
          localchi.xgf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(14757);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(14757);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.chi
 * JD-Core Version:    0.6.2
 */