package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cz extends com.tencent.mm.bt.a
{
  public int cIb;
  public int pOA;
  public String pPZ;
  public int scene;
  public String vFb;
  public String vFc;
  public String vFd;
  public abv vFe;
  public String vFf;
  public int vFg;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56702);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vFb == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: f2f_id");
        AppMethodBeat.o(56702);
        throw paramArrayOfObject;
      }
      if (this.vFd == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: payok_checksign");
        AppMethodBeat.o(56702);
        throw paramArrayOfObject;
      }
      if (this.vFb != null)
        paramArrayOfObject.e(1, this.vFb);
      if (this.vFc != null)
        paramArrayOfObject.e(2, this.vFc);
      paramArrayOfObject.iz(3, this.cIb);
      paramArrayOfObject.iz(4, this.pOA);
      paramArrayOfObject.iz(5, this.scene);
      if (this.vFd != null)
        paramArrayOfObject.e(6, this.vFd);
      if (this.vFe != null)
      {
        paramArrayOfObject.iy(7, this.vFe.computeSize());
        this.vFe.writeFields(paramArrayOfObject);
      }
      if (this.vFf != null)
        paramArrayOfObject.e(8, this.vFf);
      if (this.pPZ != null)
        paramArrayOfObject.e(9, this.pPZ);
      paramArrayOfObject.iz(10, this.vFg);
      AppMethodBeat.o(56702);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vFb == null)
        break label930;
    label930: for (paramInt = e.a.a.b.b.a.f(1, this.vFb) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vFc != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vFc);
      i = i + e.a.a.b.b.a.bs(3, this.cIb) + e.a.a.b.b.a.bs(4, this.pOA) + e.a.a.b.b.a.bs(5, this.scene);
      paramInt = i;
      if (this.vFd != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vFd);
      i = paramInt;
      if (this.vFe != null)
        i = paramInt + e.a.a.a.ix(7, this.vFe.computeSize());
      paramInt = i;
      if (this.vFf != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.vFf);
      i = paramInt;
      if (this.pPZ != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.pPZ);
      paramInt = i + e.a.a.b.b.a.bs(10, this.vFg);
      AppMethodBeat.o(56702);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vFb == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: f2f_id");
          AppMethodBeat.o(56702);
          throw paramArrayOfObject;
        }
        if (this.vFd == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: payok_checksign");
          AppMethodBeat.o(56702);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56702);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cz localcz = (cz)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56702);
          break;
        case 1:
          localcz.vFb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56702);
          paramInt = i;
          break;
        case 2:
          localcz.vFc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56702);
          paramInt = i;
          break;
        case 3:
          localcz.cIb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56702);
          paramInt = i;
          break;
        case 4:
          localcz.pOA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56702);
          paramInt = i;
          break;
        case 5:
          localcz.scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56702);
          paramInt = i;
          break;
        case 6:
          localcz.vFd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56702);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new abv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcz.vFe = paramArrayOfObject;
          }
          AppMethodBeat.o(56702);
          paramInt = i;
          break;
        case 8:
          localcz.vFf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56702);
          paramInt = i;
          break;
        case 9:
          localcz.pPZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56702);
          paramInt = i;
          break;
        case 10:
          localcz.vFg = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56702);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56702);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cz
 * JD-Core Version:    0.6.2
 */