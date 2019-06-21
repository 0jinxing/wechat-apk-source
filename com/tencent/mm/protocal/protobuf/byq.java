package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class byq extends btd
{
  public int fJT;
  public float fJV;
  public int wXR;
  public SKBuiltinBuffer_t wXS;
  public SKBuiltinBuffer_t wXT;
  public SKBuiltinBuffer_t wXU;
  public SKBuiltinBuffer_t wXV;
  public SKBuiltinBuffer_t wXW;
  public int wXX;
  public int wXY;
  public String wXZ;
  public SKBuiltinBuffer_t wrC;
  public SKBuiltinBuffer_t wrD;
  public SKBuiltinBuffer_t wrE;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28647);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28647);
        throw paramArrayOfObject;
      }
      if (this.wXS == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: SongName");
        AppMethodBeat.o(28647);
        throw paramArrayOfObject;
      }
      if (this.wXT == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: SongSinger");
        AppMethodBeat.o(28647);
        throw paramArrayOfObject;
      }
      if (this.wrD == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: SongAlbum");
        AppMethodBeat.o(28647);
        throw paramArrayOfObject;
      }
      if (this.wrE == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: SongAlbumUrl");
        AppMethodBeat.o(28647);
        throw paramArrayOfObject;
      }
      if (this.wXU == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: SongWifiUrl");
        AppMethodBeat.o(28647);
        throw paramArrayOfObject;
      }
      if (this.wXV == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: SongWapLinkUrl");
        AppMethodBeat.o(28647);
        throw paramArrayOfObject;
      }
      if (this.wXW == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: SongWebUrl");
        AppMethodBeat.o(28647);
        throw paramArrayOfObject;
      }
      if (this.wrC == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: SongLyric");
        AppMethodBeat.o(28647);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.fJT);
      paramArrayOfObject.iz(3, this.wXR);
      paramArrayOfObject.r(4, this.fJV);
      if (this.wXS != null)
      {
        paramArrayOfObject.iy(5, this.wXS.computeSize());
        this.wXS.writeFields(paramArrayOfObject);
      }
      if (this.wXT != null)
      {
        paramArrayOfObject.iy(6, this.wXT.computeSize());
        this.wXT.writeFields(paramArrayOfObject);
      }
      if (this.wrD != null)
      {
        paramArrayOfObject.iy(7, this.wrD.computeSize());
        this.wrD.writeFields(paramArrayOfObject);
      }
      if (this.wrE != null)
      {
        paramArrayOfObject.iy(8, this.wrE.computeSize());
        this.wrE.writeFields(paramArrayOfObject);
      }
      if (this.wXU != null)
      {
        paramArrayOfObject.iy(9, this.wXU.computeSize());
        this.wXU.writeFields(paramArrayOfObject);
      }
      if (this.wXV != null)
      {
        paramArrayOfObject.iy(10, this.wXV.computeSize());
        this.wXV.writeFields(paramArrayOfObject);
      }
      if (this.wXW != null)
      {
        paramArrayOfObject.iy(11, this.wXW.computeSize());
        this.wXW.writeFields(paramArrayOfObject);
      }
      if (this.wrC != null)
      {
        paramArrayOfObject.iy(12, this.wrC.computeSize());
        this.wrC.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(13, this.wXX);
      paramArrayOfObject.iz(14, this.wXY);
      if (this.wXZ != null)
        paramArrayOfObject.e(15, this.wXZ);
      AppMethodBeat.o(28647);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label2373;
    label2373: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.fJT) + e.a.a.b.b.a.bs(3, this.wXR) + (e.a.a.b.b.a.fv(4) + 4);
      i = paramInt;
      if (this.wXS != null)
        i = paramInt + e.a.a.a.ix(5, this.wXS.computeSize());
      paramInt = i;
      if (this.wXT != null)
        paramInt = i + e.a.a.a.ix(6, this.wXT.computeSize());
      i = paramInt;
      if (this.wrD != null)
        i = paramInt + e.a.a.a.ix(7, this.wrD.computeSize());
      int j = i;
      if (this.wrE != null)
        j = i + e.a.a.a.ix(8, this.wrE.computeSize());
      paramInt = j;
      if (this.wXU != null)
        paramInt = j + e.a.a.a.ix(9, this.wXU.computeSize());
      i = paramInt;
      if (this.wXV != null)
        i = paramInt + e.a.a.a.ix(10, this.wXV.computeSize());
      paramInt = i;
      if (this.wXW != null)
        paramInt = i + e.a.a.a.ix(11, this.wXW.computeSize());
      i = paramInt;
      if (this.wrC != null)
        i = paramInt + e.a.a.a.ix(12, this.wrC.computeSize());
      i = i + e.a.a.b.b.a.bs(13, this.wXX) + e.a.a.b.b.a.bs(14, this.wXY);
      paramInt = i;
      if (this.wXZ != null)
        paramInt = i + e.a.a.b.b.a.f(15, this.wXZ);
      AppMethodBeat.o(28647);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(28647);
          throw paramArrayOfObject;
        }
        if (this.wXS == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: SongName");
          AppMethodBeat.o(28647);
          throw paramArrayOfObject;
        }
        if (this.wXT == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: SongSinger");
          AppMethodBeat.o(28647);
          throw paramArrayOfObject;
        }
        if (this.wrD == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: SongAlbum");
          AppMethodBeat.o(28647);
          throw paramArrayOfObject;
        }
        if (this.wrE == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: SongAlbumUrl");
          AppMethodBeat.o(28647);
          throw paramArrayOfObject;
        }
        if (this.wXU == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: SongWifiUrl");
          AppMethodBeat.o(28647);
          throw paramArrayOfObject;
        }
        if (this.wXV == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: SongWapLinkUrl");
          AppMethodBeat.o(28647);
          throw paramArrayOfObject;
        }
        if (this.wXW == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: SongWebUrl");
          AppMethodBeat.o(28647);
          throw paramArrayOfObject;
        }
        if (this.wrC == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: SongLyric");
          AppMethodBeat.o(28647);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28647);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        byq localbyq = (byq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28647);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((BaseResponse)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbyq.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(28647);
          paramInt = i;
          break;
        case 2:
          localbyq.fJT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28647);
          paramInt = i;
          break;
        case 3:
          localbyq.wXR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28647);
          paramInt = i;
          break;
        case 4:
          localbyq.fJV = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(28647);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbyq.wXS = paramArrayOfObject;
          }
          AppMethodBeat.o(28647);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbyq.wXT = paramArrayOfObject;
          }
          AppMethodBeat.o(28647);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbyq.wrD = paramArrayOfObject;
          }
          AppMethodBeat.o(28647);
          paramInt = i;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbyq.wrE = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(28647);
          paramInt = i;
          break;
        case 9:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbyq.wXU = paramArrayOfObject;
          }
          AppMethodBeat.o(28647);
          paramInt = i;
          break;
        case 10:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbyq.wXV = paramArrayOfObject;
          }
          AppMethodBeat.o(28647);
          paramInt = i;
          break;
        case 11:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbyq.wXW = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(28647);
          paramInt = i;
          break;
        case 12:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbyq.wrC = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(28647);
          paramInt = i;
          break;
        case 13:
          localbyq.wXX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28647);
          paramInt = i;
          break;
        case 14:
          localbyq.wXY = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28647);
          paramInt = i;
          break;
        case 15:
          localbyq.wXZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28647);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28647);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.byq
 * JD-Core Version:    0.6.2
 */