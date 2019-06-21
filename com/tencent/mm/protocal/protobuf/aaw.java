package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class aaw extends com.tencent.mm.bt.a
{
  public String appId;
  public String cEV;
  public abf cKb;
  public String csl;
  public String desc;
  public String title;
  public int type;
  public String wif;
  public LinkedList<String> wig;

  public aaw()
  {
    AppMethodBeat.i(51396);
    this.wig = new LinkedList();
    AppMethodBeat.o(51396);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(51397);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.title != null)
        paramArrayOfObject.e(1, this.title);
      if (this.desc != null)
        paramArrayOfObject.e(2, this.desc);
      if (this.cEV != null)
        paramArrayOfObject.e(3, this.cEV);
      if (this.wif != null)
        paramArrayOfObject.e(4, this.wif);
      if (this.appId != null)
        paramArrayOfObject.e(5, this.appId);
      if (this.csl != null)
        paramArrayOfObject.e(6, this.csl);
      paramArrayOfObject.e(7, 1, this.wig);
      paramArrayOfObject.iz(8, this.type);
      if (this.cKb != null)
      {
        paramArrayOfObject.iy(9, this.cKb.computeSize());
        this.cKb.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(51397);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.title == null)
        break label820;
    label820: for (paramInt = e.a.a.b.b.a.f(1, this.title) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.desc != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.desc);
      paramInt = i;
      if (this.cEV != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.cEV);
      i = paramInt;
      if (this.wif != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wif);
      paramInt = i;
      if (this.appId != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.appId);
      i = paramInt;
      if (this.csl != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.csl);
      i = i + e.a.a.a.c(7, 1, this.wig) + e.a.a.b.b.a.bs(8, this.type);
      paramInt = i;
      if (this.cKb != null)
        paramInt = i + e.a.a.a.ix(9, this.cKb.computeSize());
      AppMethodBeat.o(51397);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wig.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(51397);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aaw localaaw = (aaw)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(51397);
          break;
        case 1:
          localaaw.title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51397);
          paramInt = i;
          break;
        case 2:
          localaaw.desc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51397);
          paramInt = i;
          break;
        case 3:
          localaaw.cEV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51397);
          paramInt = i;
          break;
        case 4:
          localaaw.wif = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51397);
          paramInt = i;
          break;
        case 5:
          localaaw.appId = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51397);
          paramInt = i;
          break;
        case 6:
          localaaw.csl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(51397);
          paramInt = i;
          break;
        case 7:
          localaaw.wig.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(51397);
          paramInt = i;
          break;
        case 8:
          localaaw.type = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(51397);
          paramInt = i;
          break;
        case 9:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new abf();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((abf)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaaw.cKb = ((abf)localObject1);
          }
          AppMethodBeat.o(51397);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(51397);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aaw
 * JD-Core Version:    0.6.2
 */