COMPONENT=pojo
VERSION=1.0

echo Building component $COMPONENT at version $VERSION
cd src/$COMPONENT

IMAGE=patrocinio/memoryleak:$VERSION
docker build -t $IMAGE .

