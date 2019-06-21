package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bgf extends com.tencent.mm.bt.a
{
  public String app_id;
  public int cvd;
  public int dtS;
  public String geZ;
  public String hHV;
  public String nickname;
  public int type;
  public String vEP;
  public String wJW;
  public String wJX;
  public String wKh;
  public String wKj;
  public String wKk;
  public String wKl;
  public String wKm;
  public bgg wKn;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80132);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.geZ != null)
        paramArrayOfObject.e(1, this.geZ);
      if (this.nickname != null)
        paramArrayOfObject.e(2, this.nickname);
      paramArrayOfObject.iz(3, this.type);
      if (this.hHV != null)
        paramArrayOfObject.e(4, this.hHV);
      if (this.wJW != null)
        paramArrayOfObject.e(5, this.wJW);
      if (this.wJX != null)
        paramArrayOfObject.e(6, this.wJX);
      paramArrayOfObject.iz(7, this.cvd);
      if (this.wKj != null)
        paramArrayOfObject.e(8, this.wKj);
      if (this.wKk != null)
        paramArrayOfObject.e(9, this.wKk);
      if (this.wKl != null)
        paramArrayOfObject.e(10, this.wKl);
      if (this.wKm != null)
        paramArrayOfObject.e(11, this.wKm);
      if (this.wKn != null)
      {
        paramArrayOfObject.iy(12, this.wKn.computeSize());
        this.wKn.writeFields(paramArrayOfObject);
      }
      if (this.vEP != null)
        paramArrayOfObject.e(13, this.vEP);
      if (this.app_id != null)
        paramArrayOfObject.e(14, this.app_id);
      paramArrayOfObject.iz(15, this.dtS);
      if (this.wKh != null)
        paramArrayOfObject.e(16, this.wKh);
      AppMethodBeat.o(80132);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.geZ == null)
        break label1249;
    label1249: for (paramInt = e.a.a.b.b.a.f(1, this.geZ) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.nickname != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.nickname);
      paramInt = i + e.a.a.b.b.a.bs(3, this.type);
      i = paramInt;
      if (this.hHV != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.hHV);
      paramInt = i;
      if (this.wJW != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wJW);
      i = paramInt;
      if (this.wJX != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.wJX);
      i += e.a.a.b.b.a.bs(7, this.cvd);
      paramInt = i;
      if (this.wKj != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.wKj);
      i = paramInt;
      if (this.wKk != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.wKk);
      paramInt = i;
      if (this.wKl != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.wKl);
      i = paramInt;
      if (this.wKm != null)
        i = paramInt + e.a.a.b.b.a.f(11, this.wKm);
      int j = i;
      if (this.wKn != null)
        j = i + e.a.a.a.ix(12, this.wKn.computeSize());
      paramInt = j;
      if (this.vEP != null)
        paramInt = j + e.a.a.b.b.a.f(13, this.vEP);
      i = paramInt;
      if (this.app_id != null)
        i = paramInt + e.a.a.b.b.a.f(14, this.app_id);
      i += e.a.a.b.b.a.bs(15, this.dtS);
      paramInt = i;
      if (this.wKh != null)
        paramInt = i + e.a.a.b.b.a.f(16, this.wKh);
      AppMethodBeat.o(80132);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80132);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bgf localbgf = (bgf)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80132);
          break;
        case 1:
          localbgf.geZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80132);
          paramInt = i;
          break;
        case 2:
          localbgf.nickname = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80132);
          paramInt = i;
          break;
        case 3:
          localbgf.type = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80132);
          paramInt = i;
          break;
        case 4:
          localbgf.hHV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80132);
          paramInt = i;
          break;
        case 5:
          localbgf.wJW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80132);
          paramInt = i;
          break;
        case 6:
          localbgf.wJX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80132);
          paramInt = i;
          break;
        case 7:
          localbgf.cvd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80132);
          paramInt = i;
          break;
        case 8:
          localbgf.wKj = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80132);
          paramInt = i;
          break;
        case 9:
          localbgf.wKk = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80132);
          paramInt = i;
          break;
        case 10:
          localbgf.wKl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80132);
          paramInt = i;
          break;
        case 11:
          localbgf.wKm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80132);
          paramInt = i;
          break;
        case 12:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bgg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bgg)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbgf.wKn = ((bgg)localObject1);
          }
          AppMethodBeat.o(80132);
          paramInt = i;
          break;
        case 13:
          localbgf.vEP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80132);
          paramInt = i;
          break;
        case 14:
          localbgf.app_id = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80132);
          paramInt = i;
          break;
        case 15:
          localbgf.dtS = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80132);
          paramInt = i;
          break;
        case 16:
          localbgf.wKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80132);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80132);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bgf
 * JD-Core Version:    0.6.2
 */