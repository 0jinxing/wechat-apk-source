package com.tencent.mm.compatible.util;

import android.support.d.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exif
{
  public static final int PARSE_EXIF_ERROR_CORRUPT = 1985;
  public static final int PARSE_EXIF_ERROR_NO_EXIF = 1983;
  public static final int PARSE_EXIF_ERROR_NO_JPEG = 1982;
  public static final int PARSE_EXIF_ERROR_UNKNOWN_BYTEALIGN = 1984;
  public static final int PARSE_EXIF_SUCCESS = 0;
  private static final String TAG = "MicroMsg.Exif";
  public double altitude = 0.0D;
  public short bitsPerSample;
  public String copyright;
  public String dateTime;
  public String dateTimeDigitized;
  public String dateTimeOriginal;
  public double exposureBiasValue;
  public double exposureTime;
  public double fNumber;
  public int fileSource;
  public byte flash;
  public double focalLength;
  public short focalLengthIn35mm;
  public String imageDescription;
  public int imageHeight;
  public int imageWidth;
  public short isoSpeedRatings;
  public double latitude = -1.0D;
  public double longitude = -1.0D;
  private a mExif;
  public String make;
  public short meteringMode;
  public String model;
  public short orientation;
  public int sceneType;
  public double shutterSpeedValue;
  public String software;
  public String subSecTimeOriginal;
  public double subjectDistance;
  public String yCbCrSubSampling;

  public static Exif fromFile(String paramString)
  {
    AppMethodBeat.i(93095);
    Exif localExif = new Exif();
    localExif.parseFromFile(paramString);
    AppMethodBeat.o(93095);
    return localExif;
  }

  public static Exif fromStream(InputStream paramInputStream)
  {
    AppMethodBeat.i(93096);
    Exif localExif = new Exif();
    localExif.parseFromStream(paramInputStream);
    AppMethodBeat.o(93096);
    return localExif;
  }

  private void readExifFromInterface()
  {
    int i = -1;
    AppMethodBeat.i(93091);
    if (this.mExif == null)
    {
      AppMethodBeat.o(93091);
      return;
    }
    this.imageDescription = this.mExif.getAttribute("ImageDescription");
    this.make = this.mExif.getAttribute("Make");
    this.model = this.mExif.getAttribute("Model");
    this.orientation = ((short)(short)this.mExif.getAttributeInt("Orientation", 0));
    this.bitsPerSample = ((short)(short)this.mExif.getAttributeInt("BitsPerSample", 0));
    this.software = this.mExif.getAttribute("Software");
    this.dateTime = this.mExif.getAttribute("DateTime");
    this.dateTimeOriginal = this.mExif.getAttribute("DateTimeOriginal");
    this.dateTimeDigitized = this.mExif.getAttribute("DateTimeDigitized");
    this.subSecTimeOriginal = this.mExif.getAttribute("SubSecTimeOriginal");
    this.copyright = this.mExif.getAttribute("Copyright");
    this.exposureTime = this.mExif.getAttributeDouble("ExposureTime", 0.0D);
    this.fNumber = this.mExif.getAttributeDouble("FNumber", 0.0D);
    this.isoSpeedRatings = ((short)(short)this.mExif.getAttributeInt("ISOSpeedRatings", 0));
    this.flash = ((byte)(byte)this.mExif.getAttributeInt("Flash", 0));
    this.imageWidth = this.mExif.getAttributeInt("ImageWidth", 0);
    this.imageHeight = this.mExif.getAttributeInt("ImageLength", 0);
    this.fileSource = this.mExif.getAttributeInt("FileSource", 0);
    this.sceneType = this.mExif.getAttributeInt("SceneType", 0);
    Object localObject = this.mExif.cH();
    if (localObject != null)
    {
      this.latitude = localObject[0];
      this.longitude = localObject[1];
    }
    localObject = this.mExif;
    double d = ((a)localObject).getAttributeDouble("GPSAltitude", -1.0D);
    int j = ((a)localObject).getAttributeInt("GPSAltitudeRef", -1);
    if ((d >= 0.0D) && (j >= 0))
      if (j != 1);
    label352: for (d = i * d; ; d = 0.0D)
    {
      this.altitude = d;
      AppMethodBeat.o(93091);
      break;
      i = 1;
      break label352;
    }
  }

  public a getLocation()
  {
    AppMethodBeat.i(93093);
    a locala;
    if ((this.latitude < 0.0D) || (this.longitude < 0.0D))
    {
      locala = null;
      AppMethodBeat.o(93093);
    }
    while (true)
    {
      return locala;
      locala = new a(this.latitude, this.longitude, this.altitude);
      AppMethodBeat.o(93093);
    }
  }

  public int getOrientationInDegree()
  {
    int i = 90;
    AppMethodBeat.i(93092);
    if (this.mExif != null)
      switch (this.mExif.getAttributeInt("Orientation", 1))
      {
      default:
        AppMethodBeat.o(93092);
        i = 0;
      case 6:
      case 7:
      case 3:
      case 4:
      case 5:
      case 8:
      }
    while (true)
    {
      return i;
      AppMethodBeat.o(93092);
      continue;
      AppMethodBeat.o(93092);
      i = 180;
      continue;
      AppMethodBeat.o(93092);
      i = 270;
      continue;
      switch (this.orientation)
      {
      case 4:
      case 5:
      case 7:
      default:
        AppMethodBeat.o(93092);
        i = 0;
        break;
      case 6:
        AppMethodBeat.o(93092);
        break;
      case 3:
        AppMethodBeat.o(93092);
        i = 180;
        break;
      case 8:
        AppMethodBeat.o(93092);
        i = 270;
      }
    }
  }

  public long getUxtimeDatatimeOriginal()
  {
    long l1 = 0L;
    AppMethodBeat.i(93094);
    try
    {
      Object localObject = this.dateTimeOriginal;
      if (localObject == null)
      {
        AppMethodBeat.o(93094);
        l2 = l1;
      }
      while (true)
      {
        return l2;
        localObject = new java/text/SimpleDateFormat;
        ((SimpleDateFormat)localObject).<init>("yyyy:MM:dd HH:mm:ss");
        l2 = ((SimpleDateFormat)localObject).parse(this.dateTimeOriginal).getTime() / 1000L;
        AppMethodBeat.o(93094);
      }
    }
    catch (ParseException localParseException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Exif", localParseException, "", new Object[0]);
        AppMethodBeat.o(93094);
        long l2 = l1;
      }
    }
  }

  public int parseFrom(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(93089);
    int i = parseFromStream(new ByteArrayInputStream(paramArrayOfByte));
    AppMethodBeat.o(93089);
    return i;
  }

  public int parseFrom(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(93090);
    paramInt1 = parseFromStream(new ByteArrayInputStream(paramArrayOfByte, paramInt1, paramInt2));
    AppMethodBeat.o(93090);
    return paramInt1;
  }

  public int parseFromFile(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(93087);
    Object localObject1 = null;
    Object localObject2 = null;
    try
    {
      InputStream localInputStream = e.openRead(paramString);
      localObject2 = localInputStream;
      localObject1 = localInputStream;
      a locala = new android/support/d/a;
      localObject2 = localInputStream;
      localObject1 = localInputStream;
      locala.<init>(localInputStream);
      localObject2 = localInputStream;
      localObject1 = localInputStream;
      this.mExif = locala;
      localObject2 = localInputStream;
      localObject1 = localInputStream;
      readExifFromInterface();
      return i;
    }
    catch (Exception localException)
    {
      while (true)
      {
        localObject1 = localObject2;
        ab.w("MicroMsg.Exif", "Cannot read EXIF from file '%s': %s", new Object[] { paramString, localException.getMessage() });
        bo.b(localObject2);
        i = -1;
        AppMethodBeat.o(93087);
      }
    }
    finally
    {
      bo.b(localObject1);
      AppMethodBeat.o(93087);
    }
    throw paramString;
  }

  public int parseFromStream(InputStream paramInputStream)
  {
    int i = 0;
    AppMethodBeat.i(93088);
    try
    {
      a locala = new android/support/d/a;
      locala.<init>(paramInputStream);
      this.mExif = locala;
      readExifFromInterface();
      AppMethodBeat.o(93088);
      return i;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.w("MicroMsg.Exif", "Cannot read EXIF from stream '%s': %s", new Object[] { paramInputStream, localException.getMessage() });
        i = -1;
        AppMethodBeat.o(93088);
      }
    }
  }

  public static final class a
  {
    public double altitude;
    public double latitude;
    public double longitude;

    public a(double paramDouble1, double paramDouble2, double paramDouble3)
    {
      this.latitude = paramDouble1;
      this.longitude = paramDouble2;
      this.altitude = paramDouble3;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.util.Exif
 * JD-Core Version:    0.6.2
 */