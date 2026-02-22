pipeline{
agent any
stages{
stage(Build){
steps{
echo 'Building.....'
ssh mvn clean install
}
}
}
}